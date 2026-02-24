package tutorial.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

    static class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


    public static void main(String[] args) {
        Interval v1 = new Interval(10, 4);
        Interval v2 = new Interval(1, 2);

        List<Interval> intervals = Arrays.asList(v1, v2);

        Collections.sort(intervals, (a, b) -> Integer.compare(b.start, a.start));

        for (Interval interval : intervals) {
            System.out.println(interval.start + ", " + interval.end);
        }
    }
}
