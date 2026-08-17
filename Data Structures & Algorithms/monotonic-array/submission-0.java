class Solution {
    public boolean isMonotonic(int[] nums) {
        int increase = 1;
        int decrease = 1;
        for(int  i = 1 ; i < nums.length ; i++)
        {
            if(nums[i - 1] <= nums[i]){
                increase++;
            }
            if(nums[i - 1] >= nums[i]){
                decrease++;
            }
        }
        return increase == nums.length || decrease == nums.length ? true : false;
        
    }
}