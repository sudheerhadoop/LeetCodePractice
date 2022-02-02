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


Optimal Solution:

two pointer approach:
one start and end.
Move the pointer when the start value is less else decrease the end pointer.
Remaining caluclation is same.

Time:
O(n) 
Space:
O(1)
    
class Solution {
    public int maxArea(int[] height) {
        int mxArea = 0;
        int start = 0;
        int end = height.length-1;
       while(start< end)
       {
           int length = Math.min(height[start], height[end]);
           int width = end - start;
           int area = length * width;
           mxArea = Math.max(mxArea, area);
           if(height[start] < height[end])
           {
               start++;
           }
           else{
               end--;
           }
       }
        return mxArea;
    }
}

