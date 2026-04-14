class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
     boolean [] visited = new boolean[n];
        int count =0;
          for(int i =0 ;i < n ; i++)
          {
                if(!visited[i])
                {
                dfs(isConnected, i, visited);
                count++;
                }
            }
            return count;
          }
          public void dfs(int [][] grid , int i , boolean [] visited)
          {
            int n = grid[0].length;
            visited[i] = true;
             for(int j =0 ; j<n ; j++)
             {
                if(grid[i][j]==1 && !visited[j])
                {
                    dfs(grid, j ,visited);
                }
             }
          }
    }
