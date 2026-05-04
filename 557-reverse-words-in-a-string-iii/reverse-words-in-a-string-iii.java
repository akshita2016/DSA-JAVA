class Solution {
    public String reverseWords(String s) {
       char a[] = s.toCharArray();
       int i =0;
       int n = a.length;
       for(int j =0 ; j <= a.length ; j++)
       {
        if(j == a.length ||  a[j] == ' ')
        {
            reverse(a,i,j-1);
            i=j+1;
        } 
       }
       return new String(a);
    }

    public void reverse(char []a , int i , int j)
    {
        while(i<j)
        {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}