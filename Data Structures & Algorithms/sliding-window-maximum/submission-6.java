public class Solution {
public int[] maxSlidingWindow(int[] nums, int k) {
    List<Integer> res=new ArrayList<>();
    Deque<Integer> dq=new ArrayDeque<>();
    int l=0;
    int r=0;
    while(r<nums.length){

      while(!dq.isEmpty()&&nums[dq.getLast()]<nums[r]){
      
               dq.removeLast();
      }
      
      dq.addLast(r);
      if(l>dq.getFirst()){
        dq.removeFirst();
      }
      if((r+1)>=k){
        
        res.add(nums[dq.getFirst()]);
        l++;
      }
      r++;
      
    }
    return res.stream().mapToInt(Integer::intValue).toArray();
        
  }}