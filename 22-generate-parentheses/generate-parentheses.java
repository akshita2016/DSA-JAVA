class Solution {
    ArrayList<String> result = new ArrayList<>();

    public void generate(int n , int open , int close , String s)
    {
        if(open == n && close == n)
        {
            result.add(s);
            return;
        }
          if(open < n)
        generate(n,open+1,close,s+"("); 
        
        if(open > close)
        generate(n,open,close+1,s+")");

      
    }
    public List<String> generateParenthesis(int n) {
        generate (n,0,0,"");
        return result;
    }
}