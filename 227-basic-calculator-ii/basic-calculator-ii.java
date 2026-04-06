class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
          int num =0;
          char op = '+';
        for(int i =0; i< s.length() ; i++ )
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
            }
        if((!Character.isDigit(ch) && ch!= ' ') ||  i==s.length() -1)
            {
                if (op  == '+')
                {
                    st.push(num);
                    num =0;
                }
                else if ( op == '-')
                {  
                    st.push(-num);
                    num = 0;
                }
                else if ( op  == '*')
                {
                   st.push(st.pop() * num);
                   num =0;
                }
              else 
              {
                st.push(st.pop() / num);
                num =0;
              }
            
            op = ch;
            }
        }
            int result =0;
         while(!st.isEmpty())
         {
            result += st.pop();
         }

        return result;
    }
}