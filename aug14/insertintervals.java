class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;

        int[][] result = new int[n + 1][2];

        int e = 0;
        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result[e] = intervals[i];
            e++;
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

            i++;
        }
        result[e] = newInterval;
        e++;
        while (i < n) {
            result[e] = intervals[i];
            e++;
            i++;
        }

        return Arrays.copyOf(result, e);
    }
}
