class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        int maxp = 1;
        int product = 1;
    
        for(int i=0;i<n;i++)
        {
            product = product * Math.abs(arr[i]);
            
            maxp = Math.max(product, maxp);
            
        }
        return (long)maxp;
        
    }
}
