class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length;
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=len-1;
            while(r>l){
                if((r-l)*Math.min(heights[r],heights[l])>max){
                    max=(r-l)*Math.min(heights[r],heights[l]);
                }
                if(heights[l]>heights[r]){
                    r--;
                }
                else if(heights[l]<heights[r]){
                    l++;
                }else {
                    l++;
                }
                
            }
        return max;
    }
}
