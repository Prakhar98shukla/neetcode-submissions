class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> h=new HashMap<>();
       if(s.length()!=t.length()){
        return false;
       }
       for(Character c:s.toCharArray()){
        h.put(c,h.getOrDefault(c,0)+1);
       }
       for(Character c2:t.toCharArray()){
        if(!h.containsKey(c2)||h.get(c2)==0){
            return false;
        }
        h.put(c2,h.get(c2)-1);
       }
       return true;
    }
}
