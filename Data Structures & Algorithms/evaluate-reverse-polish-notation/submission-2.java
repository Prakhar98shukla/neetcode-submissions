class Solution {
    public int evalRPN(String[] tokens) {
       String p="+*/-";
       Stack<Integer> st=new Stack<>();
       for(String s:tokens){
        if(p.contains(s)){
            int temp1=st.pop();
            int temp2=st.pop();
            if(s.equals("+")){
                st.push(temp2+temp1);
            }
            else if(s.equals("-")){
                st.push(temp2-temp1);
            }
            else if(s.equals("*")){
                st.push(temp2*temp1);
            }
            else{
                st.push(temp2/temp1);
            }
        }
        else{
            st.push(Integer.parseInt(s));
        }
       }
       return st.pop();
    }
}
