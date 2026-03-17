class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num:nums)
        {
            m.put(num,m.getOrDefault(num,0)+1);

        }
        List<Integer> result = new ArrayList<>();

        for(int num:m.keySet())
        {
            if(m.get(num)>n/3)
            {
              result.add(num);
            }
        }
        return result;
    }
}