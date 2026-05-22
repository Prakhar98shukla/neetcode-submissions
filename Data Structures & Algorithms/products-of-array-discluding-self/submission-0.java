class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int [] res=new int[len];
        int [] pre= new int[len];
        int [] post= new int[len];
        pre[0]=nums[0];
        post[len-1]=nums[len-1];
        for(int i=1;i<len;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        
        for(int j=len-2;j>0;j--){  
            post[j]=nums[j]*post[j+1];   
        }
        for(int i=0;i<len;i++){
            if(i==0){
                res[0]=post[i+1];
            }
            else if(i==len-1){
                res[i]=pre[i-1];
            }
            else{
               res[i]=pre[i-1]*post[i+1];
            }
        }
        return res;

    }
}  
