class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();
        for(int i =0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        int val =0;
        int j =0;
        int k =0;
        for(int i =0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
             int num = map.get(ch);
             while(j<num)
             {
                char c = s.charAt(j);
                num = Math.max(num,map.get(c));
                j++;
             }
             
       result.add(num-i+1);
       i=num;
        }
        return result;
    }
}