import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};
		int[][] interval2 = {{1,2},{2,3}};
		System.out.println(eraseOverlapIntervals(intervals));
	}
	
	public static int eraseOverlapIntervals(int[][] intervals) {
       int[][] intervals2 = new int[intervals.length][2];
       for(int i = intervals.length - 1, j = 0; i >= 0; i--, j++) {
    	   intervals2[j] = intervals[i];
       }
       
       return Math.min(eraseOverlapIntervals(intervals2), eraseOverlapIntervals(intervals));
    }
	
	public static int helper(int[][] intervals) {
HashSet<Integer> set = new HashSet<Integer>();
        
        int count = 0;
        for(int i = 0; i < intervals.length; i++) {
        	int[] inter = intervals[i];
        	for(int j = inter[0]; j < inter[1]; j++) {
        		if(j == inter[1])	break;
        		if(set.contains(j)) {
        			count++;
        			break;
        		}else {
        			set.add(j);
        		}
        	}
        }
        
        return count;
	}
}
