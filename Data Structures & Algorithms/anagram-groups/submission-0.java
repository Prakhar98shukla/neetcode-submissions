class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> fMap= new HashMap<>();
        for(String s:strs){
            char[] cArr=s.toCharArray();
            Arrays.sort(cArr);
            String s1= new String(cArr);
            fMap.putIfAbsent(s1,new ArrayList<>());
            fMap.get(s1).add(s);
        }
        return new ArrayList<>(fMap.values());
        
    }
}
