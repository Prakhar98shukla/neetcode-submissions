class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []res=new int[k];
             Map<Integer,Integer>h= new HashMap<>();
             for(Integer i:nums){
                 h.put(i,h.getOrDefault(i,0)+1);
             }
             List<Integer> [] arr=new ArrayList[nums.length+1];
             for(int j: h.keySet()){
                   if(arr[h.get(j)]==null){
                    arr[h.get(j)]= new ArrayList<>();
                   }
                   arr[h.get(j)].add(j);
             }
             int in=0;
             
                 for(int l=nums.length;l>=1;l--){
                    if(arr[l]!=null){
                        for(int val:arr[l]){
                            res[in]=val;
                            in++;
                        }
                        if(in==k){
                            return res;
                        }
                    }
                 }
             return res;
        }

      
    }
    

