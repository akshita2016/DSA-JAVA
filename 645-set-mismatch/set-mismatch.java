class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actual = n*(n+1)/2;
        int sum =0;
        int sum2 =0;
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums)
        {
            sum +=num;
            s.add(num);
        }
        for(int num : s)
        {
            sum2+=num;
        }
        int m = actual - sum2;
        int d = sum - sum2;
        return new int[]{d,m};

    }
}