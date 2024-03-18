class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1, m=0, res = nums[0];

        while (l<=r)        {
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
            }

            m = (l+r)/2;
            res = Math.min(res, nums[m]);
            if(nums[m]>= nums[l]) {
                //go right
                l = m + 1;
            }
            else{
                //go left
                r = m - 1;
            }
        }
    return res;
    }
}