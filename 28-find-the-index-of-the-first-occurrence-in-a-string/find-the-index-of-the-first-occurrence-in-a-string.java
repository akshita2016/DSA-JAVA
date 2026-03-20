class Solution {
    public int strStr(String hay, String need) {
         int hl = hay.length();
        int nl = need.length();

        if(nl > hl) return -1;

        for(int i=0;i<=hl-nl;i++){
            if(hay.substring(i,i+nl).equals(need)){
                return i;
            }
        }
        return -1;
    }
}