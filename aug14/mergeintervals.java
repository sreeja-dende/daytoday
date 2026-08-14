class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[][] result=new int[n][2];
        result[0]=intervals[0];
        int e=0;
        for(int i=1;i<n;i++)
        {
            if(result[e][1]>=intervals[i][0])
            {
                result[e][1]=Math.max(result[e][1],intervals[i][1]);
            }
            else
            {
                e++;
                result[e]=intervals[i];
            }
        }
        return Arrays.copyOf(result,e+1);
    }
}
