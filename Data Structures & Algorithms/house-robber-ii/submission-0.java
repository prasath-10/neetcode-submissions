class Solution {
    public int robber(int [] nums , int i ,int start ,  int [] dp){
        if(i < start){
            return 0;
        }
        if( i == start){
            return nums[i];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + robber(nums, i - 2, start , dp);
        int notpick = 0 + robber(nums , i - 1 , start ,  dp);
        return dp[i] = Math.max(pick , notpick);
    }
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int [] dp = new int [nums.length];
        int [] dp1 = new int [nums.length];
        Arrays.fill(dp , -1);
        Arrays.fill(dp1 , -1);
        int case1 =  robber(nums , nums.length - 2 , 0 , dp);
        int case2 = robber(nums , nums.length - 1 , 1 , dp1);
        return Math.max(case1 , case2);
        
    }
}