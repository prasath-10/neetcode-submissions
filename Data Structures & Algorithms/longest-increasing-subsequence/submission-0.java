class Solution {
    public int length(int[]nums , int i , int prev , int[][]dp){
        if(i == nums.length){
            return 0;
        }
        if(dp[i][prev + 1] != -1){
            return dp[i][prev + 1];
        }
        int nottake = 0 + length(nums , i + 1 , prev , dp);
        int take = 0;
        if(prev == -1 || nums[i] > nums[prev]){
            take = 1 + length(nums , i + 1 , i , dp);
        }
        return dp[i][prev + 1] = Math.max(nottake , take);
    }
    public int lengthOfLIS(int[] nums) {
        int [][]dp = new int[nums.length][nums.length + 1];
        for(int i = 0 ; i < nums.length ;i++)
        { 
            Arrays.fill(dp[i] , -1);
        }
        return length(nums , 0 , -1 , dp);
        
    }
}