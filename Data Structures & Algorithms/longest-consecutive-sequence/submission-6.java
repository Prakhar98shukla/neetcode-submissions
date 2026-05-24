class Solution {
     public int longestConsecutive(int[] nums) {
       Set<Integer> h= new HashSet<>();
       for(int i: nums){
               h.add(i);
       }
       int res=0;
       for(int j: h){
        int n=j+1;
        int len=1;
        if(!h.contains(j-1)){
            while(h.contains(n)){
                len++;
                //h.remove(n);
                n++;   
            }
        }
        res=Math.max(res,len);
       }
       return res;
    }
}
