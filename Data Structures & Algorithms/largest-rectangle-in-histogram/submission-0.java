class Solution {
  public int largestRectangleArea(int[] heights) {
      Stack<Integer> st=new Stack<>();
      int area=0;
      for(int i=0;i<heights.length;i++){
          int left=-1;
          int right=heights.length;
          while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
              int temp=st.pop();
              left=st.isEmpty()?-1:st.peek();
              area=Math.max(area,(heights[temp]*(i-left-1)));
          }
          st.push(i);
      }
      int r=heights.length;
      while(!st.isEmpty()){
          int l=st.pop();
          
          int left=st.isEmpty()?-1:st.peek();
          System.out.println("l:"+l+" left:"+left+" r:"+r);
          area=Math.max(area,(heights[l]*(r-left-1)));
      }
     return area; 
  }
}