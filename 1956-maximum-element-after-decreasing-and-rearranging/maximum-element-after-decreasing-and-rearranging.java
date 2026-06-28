class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max = 1;
        Arrays.sort(arr);
      
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i] < max) continue;
            max++;
         
        }
        return max-1;

    }
}