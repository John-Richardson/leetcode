class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results= new ArrayList<List<Integer>>();
        Arrays.sort(nums);//sort the array first, as we want to avoid duplicate answers
        for(int left =0; left< nums.length-2; left++)                {
            if(left > 0 && nums[left-1] == nums[left]){ //don't want dupes
                continue;
            }

            //do the sum on what remains
            List<List<Integer>> subResult = twoSum(nums, 0-nums[left], left+1);
            if(subResult.size()> 0){
                results.addAll(subResult);
            }
        }
        return results;
    }

    public List<List<Integer>> twoSum(int[] numbers, int target, int left) {
        int right = numbers.length-1, sum =0;
        List<List<Integer>> allResult = new ArrayList<List<Integer>>();
        while(left<right)        {
            sum = numbers[left] + numbers[right];
            if(sum == target){
                List<Integer> result = new ArrayList<Integer>();
                result.add(0-target);
                result.add(numbers[left]);
                result.add(numbers[right]);
                allResult.add(result);
                left++;
                right--;
            }
            else if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
        }
        return allResult;
    }
}