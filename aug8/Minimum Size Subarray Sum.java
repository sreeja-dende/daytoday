class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int ml=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++)
        {  sum=sum+nums[r];
            while(sum>=target)
            {   int l=r-left+1;
                ml=Math.min(ml,l);
                sum=sum-nums[left];
                left++;
                
            }
           
        }
      return ml == Integer.MAX_VALUE ? 0 : ml;   //if sum is less it should return 0 not max value i assigned
    }
}
