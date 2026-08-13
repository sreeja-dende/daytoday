class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
     int valid=-1;
     int invalid=-1;
     int  count=0;
     for(int i=0;i<nums.length;i++)
     {   if(nums[i]>=left)
         {valid=i;
         }
         if(nums[i]>right)
         {
            invalid=i;
         }
        count=count+valid-invalid;
     }
     return count;
    }
}
