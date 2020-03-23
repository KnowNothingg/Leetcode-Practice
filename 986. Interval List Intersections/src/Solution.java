import java.util.ArrayList;

public class Solution {
	
	public static void main(String[] args) {
		int[][] A = {{0,2},{5, 10},{13,23},{24,25}};
		int[][] B = {{1,5},{8,12},{15,24},{25,26}};
		System.out.println(intervalIntersection(A, B)); // answer: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

	}
	
	public static int[][] intervalIntersection(int[][] A, int[][] B) {
		ArrayList<int[]> answer = new ArrayList<int[]>();
		
		int i = 0, j = 0;
		while(i < A.length && j < B.length) {
			int leftA = A[i][0];
			int rightA = A[i][1];
			int leftB = B[j][0];
			int rightB = B[j][1];
			
			if(rightA < leftB) {
				i++;
			}else if(rightB < leftA) {
				j++;
			}else {
				int[] inter = {Math.max(leftA, leftB), Math.min(rightA, rightB)};
				answer.add(inter);
				if(rightA < rightB) {
					i++;
				}else {
					j++;
				}
			}
			
			
		}
		int[][] finalAnswer = new int[answer.size()][2];
		for(int k = 0; k < answer.size(); k++) {
			finalAnswer[k][0] = answer.get(k)[0];
			finalAnswer[k][1] = answer.get(k)[1];

		}
		return finalAnswer;
	}
}
