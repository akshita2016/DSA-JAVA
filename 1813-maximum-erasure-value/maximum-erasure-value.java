class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        Set<Integer>set = new HashSet<>();
        int val=0;
         int left =0;
         for(int right = 0 ; right< nums.length ; right++)
         {
            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                val-=nums[left];
                left++;

            }
            set.add(nums[right]);
            val+=nums[right];
            max = Math.max(max , val);
         }
        return max;
    }
}