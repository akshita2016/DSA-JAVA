class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
      List<int[]> result = new ArrayList<>();
     int n = intervals.length;
      for(int i =0 ; i< intervals.length;i++)
           {
            int [] val = new int[2];
            val[0] = intervals[i][0];   
            val[1] = intervals[i][1];

            while(i+1<n && val[1] >= intervals[i+1][0])
            {
                val[0] = Math.min(val[0],intervals[i+1][0]);
                val[1] = Math.max(val[1],intervals[i+1][1]);
                i++;
            }

            result.add(val);
           }
           return result.toArray(new int[result.size()][]);
    }
}