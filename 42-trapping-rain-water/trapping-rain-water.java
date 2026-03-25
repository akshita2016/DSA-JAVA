class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
          int area = 0;
          int l=0;
          int w=0;
          for( int i=0 ;i<height.length; i++)
          {
            while(!s.isEmpty() && height[s.peek()] < height[i])
            { 
                int curr = height[s.pop()];
                if(s.isEmpty()) break;
                 l = Math.min(height[s.peek()],height[i]) - curr;
                 w = i-s.peek()-1;
                 area += l*w;
            }
            s.push(i);
          }
          return area;
    }
}