class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder result = new StringBuilder();
        if(sum > 9*num) return "";

        while(result.length()< num)
     {   
            int digit = Math.min(9,sum);
            result.append(digit);
            sum-=digit;   
     }
        return result.toString();  
    }
}