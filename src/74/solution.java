class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rangeStart = 0, rangeEnd = this.getLength(matrix) - 1, midPoint;

        while (rangeStart <= rangeEnd) {
            midPoint = (rangeEnd + rangeStart) / 2;

            if (this.getValue(matrix, midPoint) > target) {
                // go left
                rangeEnd = midPoint - 1;
            } else if (this.getValue(matrix, midPoint) < target) {
                // go right
                rangeStart = midPoint + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getLength(int[][] matrix) {
        return matrix.length * matrix[0].length;
    }

    public static int getValue(int[][] matrix, int index) {
        int x = index / matrix[0].length;
        int y = index % matrix[0].length;
        return matrix[x][y];
    }
}