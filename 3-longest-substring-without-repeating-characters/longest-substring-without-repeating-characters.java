class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0; 
        int left =0;
        int [] last_seen = new int [256];
        Arrays.fill(last_seen , -1);
        for( int right = 0 ; right < s.length() ; right++)
        {
            char ch = s.charAt(right);
             if(last_seen[ch] >= left)
             {
                left = last_seen[ch] +1;
             }
             last_seen[ch] = right;
             max = Math.max(max ,right-left+1);
        }
        return max;
    }
}