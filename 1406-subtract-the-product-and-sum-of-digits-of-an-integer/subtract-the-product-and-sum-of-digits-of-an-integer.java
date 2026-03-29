class Solution {
    public int subtractProductAndSum(int n) {
        int p =1 , sum=0;
        while(n >0)
        {
            int res = n%10;
            sum+= res;
            p *= res;
            n/=10;
        }
        return p -sum;
    }
}