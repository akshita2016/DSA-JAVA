class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i =0 ; i<strs.length;i++)
        {
            String ch = strs[i];
            char [] s = ch.toCharArray();
            Arrays.sort(s);
            String key = new String(s);
           if(!map.containsKey(key))
           {
            map.put(key,new ArrayList<>());
           }
           map.get(key).add(ch);
        }
        return new ArrayList<>(map.values());
    }
}