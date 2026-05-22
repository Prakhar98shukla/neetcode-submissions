class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hset=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(hset.size()==nums.length){
            return false;
        }
        else{
            return true;
        }
        
    }
}