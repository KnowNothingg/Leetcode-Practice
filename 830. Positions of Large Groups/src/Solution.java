import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		String s = "bababbabaa";
		List<List<Integer>> answer = largeGroupPositions(s);
		for(int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i).toString());
		}
		
	}
	
	public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        if(S.length() <= 2) {
        	return answer;
        }
        
        int count = 0; 
        int start = 0;
        int end = -1;
        char previous = S.charAt(0);
        for(int i = 0; i < S.length(); i++) {
        	if(S.charAt(i) == previous) {
        		count++;
        		end++;
        		if(i == S.length() - 1 && count >= 3) {
        			List<Integer> sequence = new ArrayList<Integer>();
            		sequence.add(start);
            		sequence.add(end);
            		answer.add(sequence);
        		}
        	}else {
        		
        		if(count >= 3) {
            		List<Integer> sequence = new ArrayList<Integer>();
            		sequence.add(start);
            		sequence.add(end);
            		answer.add(sequence);
            	}
        		
        		previous = S.charAt(i);
        		start = i;
        		end = i;
        		count = 1;
        	}
        	
        	
        	
        		
        }
        
        return answer;
    }

}
