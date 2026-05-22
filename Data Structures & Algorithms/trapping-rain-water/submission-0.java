class Solution {
    public int trap(int[] height) {
        int maxL=height[0];
        int maxR=height[height.length-1];
        int res=0;
        int l=0;
        int r=height.length-1;
        while(r>l){
            if((Math.min(maxL,maxR)-height[l])>0){
                res=res+(Math.min(maxL,maxR)-height[l]);
            }
            if((Math.min(maxL,maxR)-height[r])>0){
                res=res+(Math.min(maxL,maxR)-height[r]);
            }
            if(maxL<height[l]){
                maxL=height[l];
            }
            if(maxR<height[r]){
                maxR=height[r];
            }
               if(maxL<=maxR){
                l++;
               }
               else{
                r--;
               }
        }
        return res;
        
    }
}
