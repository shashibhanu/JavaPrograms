package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        // Sort the intervals based on their start values
        //intervals.sort((a, b) -> a.start - b.start);
        intervals.sort(Comparator.comparing(i -> i.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            // If there is an overlap between the current and next interval, merge them
            if (currentInterval.end >= nextInterval.start) {
                currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
            } else {
                // If there is no overlap, add the current interval to the result and update currentInterval
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last interval to the result
        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>(Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        ));

        List<Interval> mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}

