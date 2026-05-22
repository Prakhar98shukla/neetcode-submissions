class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> fMap= new HashMap<>();
        for(String s:strs){
            char [] arr= new char[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }
            //char[] cArr=s.toCharArray();
            //Arrays.sort(cArr);
            String s1= new String(arr);
            fMap.putIfAbsent(s1,new ArrayList<>());
            fMap.get(s1).add(s);
        }
        return new ArrayList<>(fMap.values());
        
    }
}
