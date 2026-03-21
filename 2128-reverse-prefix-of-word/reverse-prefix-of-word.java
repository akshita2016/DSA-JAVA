class Solution {
    public String reversePrefix(String word, char ch) {
        int s = word.indexOf(ch);
        if(s==-1) return word;
        StringBuilder result = new StringBuilder();
        for(int i=s; i>=0 ;i--)
        {    
            result.append(word.charAt(i));

        }

        for(int i=s+1;i<word.length();i++)
        {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}