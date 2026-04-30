class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       vector<int>indx;
       unordered_map<int,int>mp;
       for(int i=0;i<nums.size();i++)
       {
        int need = target - nums[i];
        if(mp.contains(need))
        {
            indx.push_back(i);
            int idx=mp[need];
            indx.push_back(idx);
            return indx;
        }
        int v1 = nums[i];
        mp[v1]=i;
       }
       return indx;
    }
};