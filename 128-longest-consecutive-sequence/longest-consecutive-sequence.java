class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int count=0;

        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current = num;
                int len = 1;
                while(set.contains(current+1))
                {
                    current++;
                    len++;
                }
                count = Math.max(count,len);
            }
        }
        return count;
        
    }
}