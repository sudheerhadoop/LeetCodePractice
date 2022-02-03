Naive Approach:

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
}

Better approaches are there using HashMap: Need to add them
