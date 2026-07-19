/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()<=1){
            return true;
        }
        intervals.sort((a,b) -> Integer.compare(a.start,b.start));
        int i=1;
        Interval prev = intervals.get(0);
        while(i<intervals.size()){
            if(prev.end > intervals.get(i).start){
                return false;
            }
            prev = intervals.get(i);
            i++;
        }
        return true;

    }
}
