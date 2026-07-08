class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int l = 2*n;
        int [] result = new int [l];
        for(int i =0; i<l ; i++)
        {
            result[i] = nums[i%n];
        }
        return result;
    }
}