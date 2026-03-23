class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {    char ch = s.charAt(i);
            if(ch!='*')
             st.push(ch);
            else if(!s.isEmpty() && ch == '*')
            st.pop();

        }
        while(!st.isEmpty())
        {
        result.append(st.pop());
        }
        return result.reverse().toString();
    }
}