class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = intervals.length;
        for(int i =0; i<n ; i++)
        {
            if(!pq.isEmpty() && pq.peek() < intervals[i][0])
            {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }
        return pq.size();
    }
}