class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int i =0 ; 
        int j = n-1;
        int count =0;
        int res =0;
        Arrays.sort(tokens);
        while(i<=j)
        {
          if(power >= tokens[i])
          {
            power -=  tokens[i];
            i++;
            count++;
             res = Math.max(res,count);
          }
          else if(count >= 1 )
          {
            power += tokens[j];
            j--;
            count--;
          }
          
          else
          i++;
         
        }
    return res;
    }
}