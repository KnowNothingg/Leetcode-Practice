import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		System.out.println(removeOuterParentheses("()()"));
	}
	
	
	/*
	 * Runtime: 168 ms, faster than 6.01% of Java online submissions for Remove Outermost Parentheses.
	   Memory Usage: 38.7 MB, less than 5.19% of Java online submissions for Remove Outermost Parentheses.
	 */
	public static String removeOuterParentheses(String S) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        for(int i = 0; i < S.length(); i++) {
        	if(S.charAt(i) == '(') {
        		if(stack.size() == 0) {
        			indexs.add(i);
        		}
        		stack.push(0);
        	}else {
        		if(stack.size()==1) {
        			indexs.add(i);
        		}
        		stack.pop();
        	}
        }
        
        String answer = "";
        for(int i = 0; i < S.length(); i++) {
        	if(!indexs.contains(i)) {
        		answer += S.charAt(i);
        	}
        }
        
        return answer;
    }
	
	public static String fasterSolution(String S) {
		StringBuffer sb = new StringBuffer();
		int balance = 0;
		for(char i : S.toCharArray()) {
			if((i == '(') && ((balance += 1) > 1)) 
	            sb.append(i);
			else if ((i == ')') && ((balance -= 1) >= 1)) 
	            sb.append(i);
		}
	        
		return sb.toString();

	}
}
