class Solution {
     public int longestConsecutive(int[] nums) {
        Set<Integer> hSet=new LinkedHashSet<>();
        int res=0;
        hSet=Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        for(int i:hSet){
            if(!hSet.contains(i-1)){
                int len=1;
                while(hSet.contains(i+len)){
                     len++;
                }
                res=Math.max(res,len);
            }
        }
        
        return res;
    }
}
