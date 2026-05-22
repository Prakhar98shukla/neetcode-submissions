class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int max=0;
        Set<Character> hSet=new HashSet<>();
        int l=0;
        while(i<s.length()){
            char c=s.charAt(i);
            while(hSet.contains(c)){
                hSet.remove(s.charAt(l));
                l++;
            }
            hSet.add(c);   
            i++;
            max=Math.max(max,hSet.size());
        }
        
        return max;
    }
}
