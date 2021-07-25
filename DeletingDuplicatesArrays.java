public int removeDuplicates(int[] nums) {
                int s=1;
                int l=1;
                for(int i=1;i<nums.length;i++)
                {
                    if(nums[i]!=nums[i-1])
                    {
                        nums[s]=nums[i];
                        s++;
                        l++;
                    }
                }
                for(int i=0;i<nums.length;i++)
                {
                    System.out.println(nums[i]);
                }
                return l;
            }
