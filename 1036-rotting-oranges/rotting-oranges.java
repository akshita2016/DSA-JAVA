class Solution {
    public int orangesRotting(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int count = 0;
      Queue<int []> q = new LinkedList<>();
      for(int i =0 ; i < n ; i++)
      {
        for( int j = 0 ; j < m ; j++)
        {
            if(grid[i][j]== 2)
            {
                q.add(new int[]{i,j});

            }
            else if(grid[i][j]==1)
            count++;
        }
      }  

      int time =0;
      while(!q.isEmpty())
      {
        int size = q.size();
        boolean vis = false;
        for(int k =0 ; k< size ; k++)
        {
            int [] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int [] d : dir)
            {
                int i = r + d[0];
                int j = c + d[1];
                if(i>=0 && j>=0 && i<n && j<m && grid[i][j]==1)
                {
                    grid[i][j] =2;
                    q.add(new int[]{i , j});
                    count --;
                    vis = true;
                }

            }
        }
        if(vis) time ++;
      }
      if(count == 0 ) return time;
      else return -1;
    }
}