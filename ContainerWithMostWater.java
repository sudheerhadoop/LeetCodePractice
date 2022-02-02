BruteForce Approach:

- Area = length* width
length = minimum of two values to store water
width = difference between indicies

maxArea = 0;
area = Min(a,b)*(b index-a index)
Maxarea = Max(area, MaxArea)

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0;i<height.length;i++){
            for(int j=1;j<height.length;j++)
            {
            int length = Math.min(height[i],height[j]);
            int width = j-i;
            int area = length * width;
            maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}
