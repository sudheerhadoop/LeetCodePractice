


class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int negcount = 0;
        // Your code goes here
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negcount++;
            }
        }
        
        int[] negarr = new int[negcount];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negarr[j] = arr[i];
                j++;
            }
        }
        
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                arr[k] = arr[i];
                k++;
            }
        }
    
        for(int i=0;i<negcount;i++)
        {
            arr[k] = negarr[i];
            k++;
        }
    }
}
