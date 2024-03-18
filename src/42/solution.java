class Solution {
    public int trap(int[] height) {
        int[] leftMaxes = new int[height.length], rightMaxes = new int[height.length];
        int area =0, leftMax =0 , rightMax =0;
        for(int left =0, right = height.length-1; left < height.length; left++, right--)        {
            if(height[left]> leftMax) leftMax = height[left];
            leftMaxes[left] = leftMax;

            if(height[right]> rightMax) rightMax = height[right];
            rightMaxes[right] = rightMax;
        }

        //calc the area
        for(int i=0; i< height.length; i++){
            area += Integer.min(leftMaxes[i], rightMaxes[i]) - height[i];
        }
        return area;
    }
}