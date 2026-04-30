class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> m = new HashMap<>();

        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[k];
        int index = 0;

   
        while (k > 0) {
            int maxFreq = -1;
            int maxElement = -1;
            for (int num : m.keySet()) {
                if (m.get(num) > maxFreq) {
                    maxFreq = m.get(num);
                    maxElement = num;
                }
            }

            res[index++] = maxElement;
            m.remove(maxElement);

            k--;
        }

        return res;
    }
}