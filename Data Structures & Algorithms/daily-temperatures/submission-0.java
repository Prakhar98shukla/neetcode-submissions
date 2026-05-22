class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st=new Stack<>();
        int [] res=new int[temperatures.length];
        int index;
        for(int i=0;i<temperatures.length;i++){
            int temp=temperatures[i];
            while(!st.isEmpty()&&st.peek()[0]<temp){
            index=i-st.peek()[1];
         
          res[st.pop()[1]]=index;
        }
       st.push(new int[]{temp,i});
       
        }
        for(int[] a: st){
           res[a[1]]=0;
        }
        return res;
    }
}
