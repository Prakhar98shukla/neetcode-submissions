class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
       int r=0;
       if(s.length()==1){
        return 1;
       }
       Set<Character> h=new HashSet<>();
       int len=0;
       
       while(r<s.length()){
            while(h.contains(s.charAt(r))){
              
                
                   h.remove(s.charAt(l));
                     l++;
            }
            h.add(s.charAt(r));
            r++;
            len=Math.max(h.size(),len);

       }
       return len;
    }
}
