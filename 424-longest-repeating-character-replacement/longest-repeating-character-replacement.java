class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int result=0;
        int max=0;
        int n = s.length();
        int size=0;
        
        for(int right=0;right<n;right++)
        {
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max,map.get(c));
             
             while(right-left+1-max>k)
             {
                char m = s.charAt(left);
                map.put(m,map.get(m)-1);
                left++;
             }
            result = Math.max(result,right-left+1);
        }
        return result;
          
    }
}