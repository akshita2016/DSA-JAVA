class Solution {
    public int longestSubstring(String s, int k) {
        
       int result=0;
        for(int target = 1 ; target<=26 ; target++)
        {
          int count =0;
        int distinct =0;
        int left =0;
                int freq[] = new int[26];
 
            for(int i =0 ; i<s.length();i++)
            {
                int ch = s.charAt(i)-'a';
                if(freq[ch] == 0 ) 
                {
                    distinct++;
                    
                }
                freq[ch]++;
                
                if(freq[ch] == k) count++;
                while(distinct > target)
                {  
                    int x = s.charAt(left++) -'a';
                    if(freq[x] == k )
                    {
                        count--;
                     
                    }

                    if(--freq[x] == 0) distinct--;
                }
                  if(count == target && distinct == target)
             result = Math.max(result,i-left+1);
            }

          
        }
        return result;
    }
}