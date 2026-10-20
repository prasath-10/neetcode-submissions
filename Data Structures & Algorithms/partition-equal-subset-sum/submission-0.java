class Solution {
    public boolean partiton(int[] nums , int i , int target , Boolean[][]dp){
        if(target == 0){
            return true;
        }
        if(i == 0){
            return nums[i] == target;
        }
        if(dp[i][target] != null){
            return dp[i][target];
        }
        boolean nottake = partiton(nums , i - 1 , target , dp);
        boolean take = false;
        if(target >= nums[i]){
            take = partiton(nums , i - 1 , target - nums[i] , dp);
        }

        return dp[i][target] = nottake || take;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum = sum + num;
        }
        if(sum % 2 == 1){
            return false;
        }
        sum = sum / 2;
        Boolean [][] dp = new Boolean[nums.length][sum + 1];
        return partiton(nums , nums.length - 1 , sum , dp);

        
    }
}