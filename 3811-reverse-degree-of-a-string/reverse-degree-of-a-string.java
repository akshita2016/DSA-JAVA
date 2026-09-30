class Solution {
    public int reverseDegree(String s) {
        int num = 26;
        int val=0;
      for(int i =0; i< s.length(); i++)
      {
        char ch = s.charAt(i);
        int dig = num - (int) (ch -'a')  ;
            val = val + (dig * (i+1));
      }
      return val;
    }
}