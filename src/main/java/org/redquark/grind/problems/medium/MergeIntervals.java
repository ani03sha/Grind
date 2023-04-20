package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }
        // Sort the intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // List to store the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        // Current interval
        int[] currentInterval = intervals[0];
        // Add current interval to the list
        mergedIntervals.add(currentInterval);
        // Loop for remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // End time of the current interval
            int currentEndTime = currentInterval[1];
            // Start time of the next interval
            int nextStartTime = intervals[i][0];
            // End time of the next interval
            int nextEndTime = intervals[i][1];
            // If the intervals overlap
            if (nextStartTime <= currentEndTime) {
                currentInterval[1] = Math.max(currentEndTime, nextEndTime);
            }
            // If not, we will the next interval to the list
            else {
                mergedIntervals.add(intervals[i]);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
