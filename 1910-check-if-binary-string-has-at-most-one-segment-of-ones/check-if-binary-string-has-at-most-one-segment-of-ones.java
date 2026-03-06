class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.charAt(0)-'0'==1)
        return true;
        int n = s.length();
        for(int i=1;i<n;i++)
        { 
            if(s.charAt(i-1)-'0'==0 && s.charAt(i)-'0'==1)
            return false;
          
        }
        return true;
    }
}