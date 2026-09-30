class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length;
        long sum =0;
        int diff[] = new int [n];

        for(int i =0 ; i<n ; i++)
        {
            sum += technique2[i];
            diff[i] = technique1[i] - technique2[i];
        }

        Arrays.sort(diff);
        int count =0;
        for(int i =n-1 ; i>= 0 ; i--)
        {   
            if(diff[i]>0 )
           { sum += diff[i];
               count++;
           }
           else if(count<k)
           {sum +=diff[i];
           count++;
           }
        }

        return sum;
    }
}