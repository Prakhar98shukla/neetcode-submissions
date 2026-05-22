class Solution {
     public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        Set<Integer> hSet=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            hSet.add(nums[i]);   
        }
        
        int l=0;
        int temp=nums[0];
        int res=0;
        for(int j:hSet){
            
            if(temp+1==j){
                l++;
                if(l>res){
                    res=l;
                    }
            }
            else{
                l=0;
            }
           temp=j;
        }
        return res+1;
    }
}
