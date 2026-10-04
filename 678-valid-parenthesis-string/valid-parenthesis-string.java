class Solution {

    public int helper(String s , int open , int i , int dp[][])
    {
        if(open <0)
        {
            return -1;
        }
        if(i == s.length())
        {
            if(open == 0)
            return 1;
            return -1;
        }
        if(dp[open][i]!=0) return dp[open][i];

        if(s.charAt(i) == '(')
        return dp[open][i] = helper(s,open+1,i+1,dp);
        else if (s.charAt(i) == ')')
        return dp[open][i] = helper(s,open-1, i+1 , dp);
        else
        {
            int one = helper(s,open+1,i+1,dp);
             int two = helper(s,open-1,i+1,dp);
              int three = helper(s,open,i+1,dp);

              if(one == 1 || two  ==1 || three ==1 )
              return dp[open][i] = 1;
        }

        return dp[open][i] = -1;
    }

    public boolean checkValidString(String s) {
        int n = s.length();
         int dp[][] = new int [n][n];
         return helper(s,0,0,dp) == 1;
    }
}