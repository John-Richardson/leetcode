class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++)        {
            //if dupe, move on
            if(nums[right -1] == nums[right]) continue;

            //it's a new number
            nums[left] = nums[right];
            left++;
        }
        return left;
    }
}