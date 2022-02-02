- Calculate the total sum of n numbers using the formula 
n*(n+1)/2
- Calculate sum of all numbers in array
- Difference between both sums will give the missing number


class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum =0;
        int rsum = len*(len+1)/2;
        for(int i=0;i<len;i++)
        {
            sum = sum+nums[i];
        }
        
        return rsum-sum;       
}
}
