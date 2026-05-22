class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map<Integer,Integer> hMap=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
             hMap.put(nums[i],hMap.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int j=0;j<bucket.length;j++){
            bucket[j]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:hMap.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }
        int index=0;
        for(int i=bucket.length-1;i>0&&index<k;i--){
                for(int m:bucket[i]){
                    res[index++]=m;
                }
                if(index==k){
                    return res;
                }
        }
    return res;
        }

      
    }
    

