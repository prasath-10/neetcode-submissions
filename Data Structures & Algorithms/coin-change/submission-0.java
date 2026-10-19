class Solution {
    public int coin(int[]coins , int target , int  i , int[][]dp){
        if(i == 0){
            if(target % coins[i] == 0){
                return target / coins[i];
            }
            else{
                 return 1_000_000_000;
            }
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }
        int nottake = 0 + coin(coins , target , i - 1 , dp);
        int take = 1_000_000_000;
        if(coins[i] <= target){
            take = 1 + coin(coins , target - coins[i] , i , dp);
        }

        return dp[i][target] = Math.min(nottake , take);
    }
    public int coinChange(int[] coins, int amount) {
        int [][]dp = new int[coins.length][amount + 1];
        for(int  i = 0 ; i < coins.length ; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
        int ans =  coin(coins , amount , coins.length - 1 , dp );
        return ans >= 1_000_000_000 ? -1 : ans;
        
    }
}