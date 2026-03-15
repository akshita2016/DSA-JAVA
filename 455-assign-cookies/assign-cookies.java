class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count=0;
        int j=0,i=0;
       while(i<n && j<m)
       {
        if(j<m && s[j]>=g[i])
        {
           count++;
           i++;
        }
        j++;
       }
       return count;

    }
}