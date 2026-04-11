class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int oldcolor = image[sr][sc];
        if(oldcolor == color)return image;
          dfs(image, sr, sc , color , oldcolor);
          return image;
    }
    public void dfs(int [][]image , int sr , int sc , int color , int oldcolor)
    {
        int n = image.length;
        int m = image[0].length;
        if(sr<0 || sc <0 || sr>=n || sc>=m || image[sr][sc]!=oldcolor ) return ;

        image[sr][sc] = color;
         dfs(image, sr+1 , sc , color , oldcolor);
         dfs(image, sr-1 , sc , color , oldcolor);
          dfs(image, sr , sc+1 , color , oldcolor);
           dfs(image, sr , sc-1 , color , oldcolor);

    }
}