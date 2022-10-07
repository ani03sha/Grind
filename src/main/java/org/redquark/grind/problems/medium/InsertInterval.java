package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // List to store the final intervals - merged and inserted
        List<int[]> finalIntervals = new ArrayList<>();
        // Index to traverse through the array
        int index = 0;
        // Total number of intervals
        int n = intervals.length;
        // Check for the first case, where all intervals are
        // smaller than the interval to be inserted
        while (index < n && intervals[index][1] < newInterval[0]) {
            finalIntervals.add(intervals[index]);
            index++;
        }
        // Check for the case where interval[i] and newInterval need
        // to be merged
        while (index < n && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }
        finalIntervals.add(newInterval);
        // For all the cases where interval[i] > newInterval
        while (index < n) {
            finalIntervals.add(intervals[index]);
            index++;
        }
        return finalIntervals.toArray(new int[0][]);
    }
}
