class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int n : arr)
        {
            m.put(n,m.getOrDefault(n,0)+1);
        }
       HashSet<Integer> s = new HashSet<>();
       for(int num : m.values())
       {
             if(!s.contains(num))
             s.add(num);
          else  if(s.contains(num))
             return false;
       }
       return true;
    }
}