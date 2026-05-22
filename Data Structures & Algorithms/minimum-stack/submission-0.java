class MinStack {
    Node top;
    int len;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public MinStack() {
        this.len=0;
        this.top=null;
    }
    
    public void push(int val) {
        Node newNode= new Node(val);
        if(len==0){
            top=newNode;
        }else{
        newNode.next=top;
        top=newNode;
        }
        len++;
    }
    
    public void pop() {
        if(len!=0){
            top=top.next;
            len--;
        }
    }
    
    public int top() {
        if(len==0){
            return -1;
            }
        else{
           return top.val;
        }
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        Node temp=top;
        int t=len;
        while(t>0){
            min=Math.min(min,temp.val);
            temp=temp.next;
            t--;
        }
        return min;
    }
}
