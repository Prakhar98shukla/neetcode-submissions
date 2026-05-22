class Solution {
    public int trap(int[] height) {
        int maxL=height[0];
        int maxR=height[height.length-1];
        int res=0,l=0,r=height.length-1;
        while(r>=l){
           if(maxL<maxR){
            maxL=Math.max(maxL,height[l]);
            if((maxL-height[l])>0){res+=maxL-height[l];}
            l++;
           }
           else{
            
            maxR=Math.max(maxR,height[r]);
            if((maxR-height[r])>0){res+=maxR-height[r];}
            r--;
           }
        }
        return res;
        
    }
}
