class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        int val = prices[0];
        for(int i =0 ; i< n ; i++)
        {
            if(val > prices[i])
            {
                val = prices[i];
            }
            else 
            {
                max = Math.max(max ,prices[i]-val);
            }
        }
        return max;
    }
}