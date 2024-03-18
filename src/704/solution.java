class Solution {
    public int search(int[] nums, int target) {
  
        int rangeStart = 0, rangeEnd = nums.length-1, midPoint;

        while( rangeStart <= rangeEnd ){
            midPoint = (rangeEnd + rangeStart)/2;

            if(nums[midPoint]> target){
                //go left
                rangeEnd = midPoint -1;
            }
            else if(nums[midPoint] < target){
                //go right
                rangeStart = midPoint + 1;
            }
            else{
                return midPoint;
            }
        }
        return -1;
    }
}