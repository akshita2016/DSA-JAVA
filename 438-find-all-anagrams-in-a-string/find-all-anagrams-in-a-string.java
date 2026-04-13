class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
          int a[] = new int [26];
        
          for(int i =0 ; i < p.length() ; i ++)
          { char  ch = p.charAt(i);
            a[ch - 'a']++;
          }
          int j=0;
          int count =p.length();
          for( int i = 0 ; i < s.length() ; i++)
          {
             
               if( a[s.charAt(i) - 'a']--  > 0)
               {
                  count --;

               }
            
              while(i-j+1 > p.length())
              {
                if(a[s.charAt(j) - 'a']++ >=0)
                count++;
                j++;
              }   

                 if(count == 0 )
               {
                result.add(j);
               }

                       
          }
    return result;
    }
}