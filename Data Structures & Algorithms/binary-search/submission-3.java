class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        if(nums[0]==target) return 0;
        while(l<r){
            if(target>nums[l]){
                l++;
            }
            if(target<nums[r]){
                r--;
            }
            if(target==nums[r]){
                return r;
            }
            if(target==nums[l]){
                return l;
            }
        }
        return -1;
    }
}
