class Solution {
    public int maxProfit(int[] prices) {
        int [] suffixmax = new int[prices.length];
        suffixmax[prices.length - 1] = prices[prices.length - 1];
        for(int  i = prices.length - 2 ; i >= 0 ; i--)
        {
            suffixmax[i] = Math.max(prices[i] , suffixmax[i + 1]);
        }
       // System.out.println(Arrays.toString(suffixmax));
        int max = 0;
        for(int i = 0 ; i < prices.length ; i++)
        {
            max = Math.max(max , suffixmax[i] - prices[i]);
        }
        return max;

        
    }
}
