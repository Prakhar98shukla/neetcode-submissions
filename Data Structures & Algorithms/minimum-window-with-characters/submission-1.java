class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> left=new HashMap<>();
        Map<Character,Integer> right=new HashMap<>();
        for(char c: t.toCharArray()){
            right.put(c,right.getOrDefault(c,0)+1);
        }
        int l=0;
        int res=Integer.MAX_VALUE;
        int have=0;
        int need=right.size();
        int winL=0;
        int winR=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            left.put(c,left.getOrDefault(c,0)+1);
            if(right.containsKey(c)&&left.get(c)==right.get(c)){
                have++;
            }
            while(have==need){
                if(res>(r-l+1)){
                        winL=l;
                        winR=r;
                    }
            res=Math.min(res, r-l+1);
                
                left.put(s.charAt(l),left.get(s.charAt(l))-1);
                if(right.containsKey(s.charAt(l))&&left.get(s.charAt(l))<right.get(s.charAt(l))){
              have--;
            }
                l++;
            }

        }
        return res==Integer.MAX_VALUE?"":s.substring(winL,winR+1);

    }
}
