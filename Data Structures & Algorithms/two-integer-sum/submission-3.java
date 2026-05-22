class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hMap=IntStream.range(0,nums.length).boxed().collect(Collectors.toMap(i->nums[i],i->i,(e1, e2) -> e1));
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(hMap.containsKey(diff)&&hMap.get(diff)!=i){
                return new int[]{Math.min(i,hMap.get(diff)),Math.max(i,hMap.get(diff))};
            }
        }
        return new int [0];

    }
}
