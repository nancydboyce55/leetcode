/**
 * Given an array of meeting time intervals consisting of start and end times 
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 * 
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]],
 * return false.
 * 
 * https://leetcode.com/problems/meeting-rooms/description/
 */
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }            
        });
        
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].end > intervals[i+1].start) {
                return false;
            }
        }
        
        return true;
    }
}