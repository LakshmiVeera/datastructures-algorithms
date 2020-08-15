package Strings;
import java.util.*;

public class MergeIntervals {
        public static int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }
            List<Interval> intervalsList = new ArrayList();
            for (int[] interval : intervals) {
                intervalsList.add(new Interval(interval[0], interval[1]));
            }

            Collections.sort(intervalsList, (interval1, interval2) -> {
                int result = interval1.start - interval2.start;
                if(result == 0) {
                    return interval1.end - interval2.end;
                }
                return result;
            });

            // Merge the intervals

            List<Interval> finalList = new ArrayList<Interval>();
            finalList.add(intervalsList.get(0));
            int j = 0;

            for (int i = 1; i < intervalsList.size(); i++){
                if(intervalsList.get(i).start > finalList.get(j).end) {
                    if(intervalsList.get(i).end < finalList.get(j).end) {
                        finalList.get(j).start = intervalsList.get(i).start;
                    }
                    else {
                        finalList.add(intervalsList.get(i));
                        j++;
                    }
                } else {
                    finalList.get(j).end = Math.max(finalList.get(j).end, intervalsList.get(i).end);
                }
            }
            int[][] finalArray = new int[finalList.size()][2];

            for (int i = 0; i < finalList.size(); i++){
                finalArray[i][0] = finalList.get(i).start;
                finalArray[i][1] = finalList.get(i).end;
            }
            return finalArray;
        }

        public static void main(String... args) {
            int[][] result = merge(new int[][]{{3,5},{3,4}, {0,2}, {1, 8}});

            for (int i =0; i < result.length; i++) {
                for (int j = 0; j< result[0].length; j++) {
                    System.out.println(result[i][j]);
                }
            }
        }
}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end =  end;
    }
}
