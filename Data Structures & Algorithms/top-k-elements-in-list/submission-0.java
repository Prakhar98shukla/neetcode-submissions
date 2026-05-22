class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hMap=new TreeMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
             hMap.put(nums[i],hMap.getOrDefault(nums[i],0)+1);
        }
        return hMap.entrySet()
                    .stream()
                    .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                    .limit(k)
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}
