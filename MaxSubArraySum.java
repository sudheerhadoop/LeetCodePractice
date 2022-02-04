class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int maxsum = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
         
         sum = sum + arr[i];
         maxsum = Math.max(sum, maxsum); 
            
        }
        
        return (long)maxsum;
    }
    
}
