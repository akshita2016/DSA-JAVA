class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();
        for(int i =0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        int start =0 ; 
        int end =0;

        for(int i =0 ; i<s.length() ; i++)
        {
           end = Math.max(end,map.get(s.charAt(i)));
           if(i==end)
           {
            result.add(end-start+1);
            start = i+1;
           }
        }
        return result;
    }
}