class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 , one = 0;
        for(int  i = 0; i < nums.length ; i++)
        {
            if(nums[i] == 1){
                one++;
            }
            else{
                max = Math.max(max , one);
                one = 0;
            }
        }
        return Math.max(max , one);
        
    }
}