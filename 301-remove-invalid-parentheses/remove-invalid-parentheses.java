class Solution {
      public Set<String> result =new HashSet<>();

      public void helper(String s, int i , int open , int close,int left , int right, StringBuilder extra)
      {
          if(i == s.length())
          {
            if(left == 0 && right  == 0 && open == close )
            {  
                result.add(extra.toString());
            }
            return;
          }

          if(open<close)
          return;

          char ch = s.charAt(i);
           if(s.charAt(i) == '(')
           {
            if(left>0)
            helper(s,i+1,open,close,left-1,right,extra);
           extra.append(ch);
            helper(s,i+1,open+1,close,left,right,extra);
             extra.deleteCharAt(extra.length()-1);
           }
           else if(s.charAt(i) == ')')
           {
            if(right >0)
            helper(s,i+1,open,close,left,right-1,extra);
              
                
                if(open>close)
                {
                    extra.append(ch);
            helper(s,i+1,open,close+1,left,right,extra);
            extra.deleteCharAt(extra.length()-1);
                }
           }
           
           else
           { 
            extra.append(ch);
            helper(s,i+1,open,close,left,right,extra);
            
            extra.deleteCharAt(extra.length()-1);
           }
      }

    public List<String> removeInvalidParentheses(String s) {
          int left =0;
          int right =0;
        for(int i =0; i < s.length() ; i++)
        {
              char ch = s.charAt(i);
              if(ch=='(')
              left++;
              else if(ch==')')
              {
                  if(left>0) left--;
                  else right++;
              }
              
        }

        StringBuilder extra = new StringBuilder();
        helper(s,0,0,0,left,right,extra);
        return new ArrayList<>(result);
    }
}