class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String ss = s + s;
        int diff1 = 0;
        int diff2 = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right < ss.length(); right++) {
            char c = ss.charAt(right);
            if(c - '0' != right % 2) diff1++;
            if(c - '0' != (right + 1) % 2) diff2++;

            if(right - left + 1 > n) {
                char lc = ss.charAt(left);
                if(lc - '0' != left % 2) diff1--;
                if(lc - '0' != (left + 1) % 2) diff2--;
                left++;
            }
            if(right - left + 1 == n) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }
        return ans;
    }
}