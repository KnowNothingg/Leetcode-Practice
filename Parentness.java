/*
Unsloved
1111. Maximum Nesting Depth of Two Valid Parentheses Strings

7/6/2019
Contest

Input: seq = "(()())"
Output: [0,1,1,1,1,0]

Input: seq = "()(())()"
Output: [0,0,0,1,1,0,1,1]
*/

import java.util.Stack;

class Parentness {
    
    public static int[] maxDepthAfterSplit(String seq) {
        Stack<Character> stack = new Stack<Character>();
        int[] arr = new int[seq.length()];

        int level = -1;
        int index = 0;
        int max = 0;
        for(int i = 0; i < seq.length(); i++){
            stack.add(seq.charAt(i));
            if(seq.charAt(i) == '('){
                level++;
            }
            max = Math.max(max, level);
            arr[index] = level;
            index++;
            if(seq.charAt(i) == ')'){
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
                level--;
            }
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int[] answer = maxDepthAfterSplit("()(((())))()");

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}