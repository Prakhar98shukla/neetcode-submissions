class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> h= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                h.put(nums[i],i);
            }
            int n;
            for(int j=0;j<nums.length;j++){
                n=target-nums[j];
                if(h.containsKey(n)&&h.get(n)!=j){
                    return new int[]{Math.min(j,h.get(n)),Math.max(j,h.get(n))};
                }
            }
            return new int[0];
    }
}
