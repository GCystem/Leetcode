public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || amount <= 0) return 0;
        int[] dp = new int[amount+1];
        
        for(int j=1;j<=amount;j++){
            dp[j] = Integer.MAX_VALUE;
            for(int i=0;i<coins.length;i++){
                if(coins[i] <= j && dp[j-coins[i]] != Integer.MAX_VALUE) dp[j] = Integer.min(dp[j],1 + dp[j-coins[i]]);
            }
        
        }
        
        if(dp[amount] == Integer.MAX_VALUE) return -1;
        else return dp[amount];
        
        
    }
}