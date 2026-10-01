class Solution {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        int n = candies.length;
          
        int ans =0;
          int low = 1;
          int high = candies[n-1];
          while(low<=high)
          {
            int mid = (low+high)/2;
            long total =0;
            for(int i =0;i<n ;i++)
            {
               total+= candies[i]/mid;

            }
            if(total>=k)
            { ans = mid;
            low = mid+1;
            }
            else
            high = mid-1;
          }
       return ans;
    }
}