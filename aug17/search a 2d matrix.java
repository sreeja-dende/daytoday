class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=matrix.length;
        int r=matrix[0].length;
        int start=0;
        int end=r+c-1;
        if(c==0)
        {return false;
        }
        while(start<=end)
        {   
            int mid=(start+end)/2;
            int e=matrix[mid/r][mid%r];
            if(e==target)
            {
                return true;
            }
            else if(target<e)
            {  
               end=mid-1;
            }
            else
            {   
                start=mid+1;
            }
        }
        return false;

    }
}
