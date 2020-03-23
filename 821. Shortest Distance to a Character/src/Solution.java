/*
 * Pass index from left to right 
 * check the distance from both side and then choose the min one
 * eg: "loveleetcode"	C = e
 * leftDis = 13, 14, 15, 0, 1, 0, 0, 1, 2, 3, 4, 0
 * rightDis = 3,  2,  1, 0, 1, 0, 0, 4, 3, 2, 1, 0
 * 
 * choose the min one from those two will give us the min distance
 * 
 * O(n) Spcae and O(n) Speed
 */
public class Solution {

	public static void main(String[] args) {
	}
	
    public static int[] shortestToChar(String S, char C) {
    	int[] answer = new int[S.length()];
    	
    	int[] leftDis = new int[S.length()];
    	int[] rightDis = new int[S.length()];
    	
    	int lDis = S.length() + 1;
    	int rDis = S.length() + 1;

    	for(int i = 0; i < S.length(); i++) {
    		int j = S.length() - 1 - i;
    		if(S.charAt(i) == C) {
    			lDis = 0;
    		}else {
    			lDis += 1;
    		}
    		
    		rDis = S.charAt(j) == C ? 0 : rDis + 1;
    		
    		leftDis[i] = lDis;
    		rightDis[j] = rDis;
    	}
    	
    	for(int i = 0; i < S.length(); i++) {
    		answer[i] = Math.min(leftDis[i], rightDis[i]);
    	}
    	
        return answer;
    }

}
