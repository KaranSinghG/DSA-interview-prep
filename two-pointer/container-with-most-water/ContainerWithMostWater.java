class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int max = 0;
        int height = 0;
        int area = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            if (heights[left] < heights[right]) {
                height = heights[left];
                area = height * (right - left);
                left++;
            } else {
                height = heights[right];
                area = height * (right - left);
                right--;
            }
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
