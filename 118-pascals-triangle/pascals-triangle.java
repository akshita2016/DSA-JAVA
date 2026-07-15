class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<>();
      for(int i =0 ; i < numRows ; i++)
      {
        List<Integer> extra = new ArrayList<>();
        extra.add(1);
        for(int j =1 ; j<i ;j++)
        {
            List<Integer> prev = result.get(i-1);
              extra.add(prev.get(j-1) + prev.get(j));
        }
        if(i>0)
        extra.add(1);
        result.add(extra);
      }
      return result;
    }
}