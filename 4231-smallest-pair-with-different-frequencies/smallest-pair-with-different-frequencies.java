class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] counter = new int[101];
        for (int num : nums) {
            counter[num]++;
        }
        int first = -1;
        for (int i=0; i<101; i++) {
            if (counter[i] > 0) {
                if (first == -1) {
                    first = i;
                } 
                else if (counter[i] != counter[first]) {
                    return new int[] {first, i};
                }
            }
        }
        return new int[] {-1, -1};
    }
}