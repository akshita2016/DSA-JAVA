class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> m = new HashMap<>();
       int result [] = new int[2];
       for(int num : nums)
       {
        m.put(num, m.getOrDefault(num,0)+1);

       }
       int i=0;
       for(int num : m.keySet())
       {
        if(m.get(num)==1)
           {
            result[i++]= num;
           }
       }

return result;
























    }
}