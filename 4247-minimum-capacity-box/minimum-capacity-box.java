class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ele = Integer.MAX_VALUE;
        int result=-1;
        for(int i=0;i<capacity.length;i++)
            { 
                if(capacity[i]>=itemSize && capacity[i]<ele)
                {ele = capacity[i];
                result=i;
                }
            }
        
        return result;
    }
}