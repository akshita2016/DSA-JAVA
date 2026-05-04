class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int result = 0;
        while(n > 1)
        {
            for(int i =0 ;i< nums.length -1 ; i++)
            {
                int temp = ( nums[i] + nums[i+1]) % 10;
                nums[i] = temp;
            }
            n--;
        }
       return nums[0]; 
    }
}