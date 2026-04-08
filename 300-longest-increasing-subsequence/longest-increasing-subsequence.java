class Solution {
    public int lengthOfLIS(int[] nums) {
        int res [] = new int[nums.length];
        int size = 0;
        for(int x : nums)
        {
            int left=0 , right=size;
            while(left!= right )
            {
                int mid = (left +right )/2;
                if(res[mid] < x)
                left = mid + 1;
                else
                right = mid;
            }
            res[left] = x;
            if(left == size)
            size++;

        }
        return size;
    }
}