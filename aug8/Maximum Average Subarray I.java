class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int l=0;
      double sum=0;
      double mavg = Double.NEGATIVE_INFINITY;
      double avg=1;
      for(int r=0;r<nums.length;r++)
      {   sum=sum+nums[r];
          if(r-l+1==k)
          {
            avg=sum/k;
            sum=sum-nums[l];
            l++;
            mavg=Math.max(mavg,avg);
          }
          
      }
      return mavg;
    }
}
