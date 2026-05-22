class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[][] arr=new int [len][2];
        for(int i=0;i<len;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        int i=0;
        int j=len-1;
        while(i<j){
            if((arr[i][0]+arr[j][0])==target){
                return new int[] {Math.min(arr[i][1],arr[j][1]),Math.max(arr[i][1],arr[j][1])};
            }
            else if ((arr[i][0]+arr[j][0])>target){
                j--;
            }
            else{
                i++;
            }
        }
        return null;
    }
}
