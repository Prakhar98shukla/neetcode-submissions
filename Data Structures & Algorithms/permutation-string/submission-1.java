class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;

        int[] arr1=new int[26];
        
        int wLen=s1.length();
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            int id=0, t=i;
            int[] arr2=new int[26];
            while(id<wLen && t<s2.length()){
                arr2[s2.charAt(t)-'a']++;
                t++;
                id++;
            }
            if(comArr(arr2,arr1)){
                return true;
            }
        }
        return false;
    }
    public boolean comArr(int[]a,int[]b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
