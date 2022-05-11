class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentavg = 0;
        double currentsum = 0;
        double maxavg = Integer.MIN_VALUE;
        
        if(nums.length == 0)
        {
            return 0.0;
        }
        
        
        for(int i=0; i<nums.length;i++)
        {
            
            currentsum = currentsum + nums[i];
            
            if(i >= k-1)
            {
                currentavg = currentsum/k;
                maxavg = Math.max(currentavg, maxavg);
                
                currentsum = currentsum-nums[i-(k-1)]; 
            }
            
        }
            return maxavg;

        }
        
}
