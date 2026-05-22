class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hMap=new HashMap<>();
        int l=0,res=0,r=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            hMap.put(s.charAt(i),hMap.getOrDefault(s.charAt(i),0)+1);
            int maxKey=Collections.max(hMap.values());
            if(((r-l+1)-maxKey)>k){
                
                hMap.put(s.charAt(l),hMap.get(s.charAt(l))-1);
                l++;
            }
           
            res=Math.max(res,(r-l+1));
             r++;
        }
        return res;
    }
}
