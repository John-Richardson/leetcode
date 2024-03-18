class Solution {
    public int removeElement(int[] nums, int val) {
        int left =0;
        for(int right =0; right<nums.length; right++){
            if(nums[right] != val){
                //store these at the left pointer
                nums[left] = nums[right];
                left ++;
            }
        }
        return left;
    }
}