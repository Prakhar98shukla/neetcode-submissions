class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            int sum=-nums[i];
            while(l<r){
                if(nums[l]+nums[r]>sum){
                    r--;
                }
                else if(nums[l]+nums[r]<sum){
                    l++;
                }
                else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[l],nums[r]);
                    res.add(temp);
                    r--;
                    l++;
                }
            } 
        }
        return new ArrayList<>(res);
    }
    
}
