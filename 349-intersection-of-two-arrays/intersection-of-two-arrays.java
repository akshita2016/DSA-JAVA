class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
           set.add(nums1[i]);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i])) 
            {
                result.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int n = result.size();
        int []ans = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]= result.get(i);
        }
        return ans;
    }
}