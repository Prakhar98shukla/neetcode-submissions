class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int[][] temp=new int[position.length][2];
    for(int i=0;i<position.length;i++){
        temp[i][0]=position[i];
        temp[i][1]=speed[i];
    }
    Arrays.sort(temp,new Comparator<int[]>(){
 
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0]-o2[0];
        }
    });

    System.out.println(Arrays.deepToString(temp));
    Stack<Double> stack=new Stack<>();
    for(int i=temp.length-1;i>=0;i--){
      double time=(double)(target-temp[i][0])/temp[i][1];
      if(!stack.isEmpty()&&time<=stack.peek()){
            continue;
      }
      stack.push(time);
    }
    return stack.size();
    }
}
