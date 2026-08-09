class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int n=nums.length;
    Deque<Integer> dq=new ArrayDeque<>();
    int index=0;
    int[] result=new int[n-k+1];
    for(int r=0;r<n;r++)
    {  while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[r])
       {   dq.removeLast();
            
       }
        while(!dq.isEmpty() && dq.peekFirst()<=r-k)
       {
        dq.removeFirst();
       }
       dq.addLast(r);

       if(r>=k-1)
       {  result[index]=nums[dq.peekFirst()];
          index++;

       }
    } 
    return result;
    }
}
