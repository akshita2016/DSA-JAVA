class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0 ;
        int max =0;
        Set<Character> set = new HashSet<>();
        for(int j =0; j< s.length();j++)
        {
            char ch = s.charAt(j);
            while(!set.add(ch))
            {
                set.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max , j-i+1);
        }
        return max;
    }
}