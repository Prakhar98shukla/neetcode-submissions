class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> h= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                h.put(nums[i],i);
            }
           
            for(int j=0;j<nums.length;j++){
                if(h.containsKey(target-nums[j])&&h.get(target-nums[j])!=j){
                    return new int[]{Math.min(j,h.get(target-nums[j])),Math.max(j,h.get(target-nums[j]))};
                }
            }
            return new int[0];
    }
}
