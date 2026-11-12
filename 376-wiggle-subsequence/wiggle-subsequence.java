class Solution {
    public int wiggleMaxLength(int[] nums) {
    
      int n = nums.length;
      int count =1;
      int diff =0;
      int result =0;
      for(int i =1 ; i<nums.length ;i++)
      {
        
        int curr = nums[i] - nums[i-1];
        if((curr > 0 && diff <=0)  || (curr <0 && diff >=0))
        {
            count++;
            diff= curr;
        }
        
      }
      return count;
    }
}