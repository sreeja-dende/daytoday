class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return  atmost(nums,k)- atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k)
    {    int result=0;
        int l=0;
        int oddcount=0;
        for(int r=0;r<nums.length;r++)
        {  if(nums[r]%2!=0)
            {
                oddcount=oddcount+1;
            }
            while(oddcount>k)
           {
              if(nums[l]%2 != 0)
              {
                oddcount--;

              }
              l++;
           }
           result=result+r-l+1;
        }return result;
    }
}
