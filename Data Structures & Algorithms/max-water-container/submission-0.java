class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if((j-i)*Math.min(heights[i],heights[j])>max){
                    max=(j-i)*Math.min(heights[i],heights[j]);
                }
            }
        }
        return max;
    }
}
