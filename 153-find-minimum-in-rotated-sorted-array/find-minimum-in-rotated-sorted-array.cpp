class Solution {
public:
    int findMin(vector<int>& nums) {
     int left=0,right=nums.size()-1 ;
    while(left<right)
    {int mid=left +(right-left)/2;

         if(nums[mid]>nums[right])
            {
                left =mid+1;
            }
   
        else
        right=mid;
    }
    return nums[left];    
        // int result=INT_MAX;
        // for(int i=0;i<nums.size();i++)
        // {
        //   result=min(result,nums[i]);
        // }
        // return result;
    
    }
};