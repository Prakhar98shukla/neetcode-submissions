class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map<Integer,Integer> hMap=new TreeMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
             hMap.put(nums[i],hMap.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer> mHeap= new PriorityQueue<>((a,b)->hMap.get(a)-hMap.get(b));
        for(int kn:hMap.keySet()){
            mHeap.add(kn);
            if(mHeap.size()>k){
                mHeap.poll();
            }
        }
        while(k -->0){
            res[k]=mHeap.poll();
        }

      return res;
    }
    
}
