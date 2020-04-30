import java.util.Stack;

class Solutions{
    public static void main(String[] args) {
        String s = "(*()";

        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        if(s.length() == 0) return true;

        Stack<Integer> leftIndex = new Stack<>();
        Stack<Integer> starIndex = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                leftIndex.add(i);
            }else if(s.charAt(i) == '*'){
                starIndex.add(i);
            }else{
                if(leftIndex.isEmpty() && starIndex.isEmpty())  return false;
                if(!leftIndex.isEmpty()){
                    leftIndex.pop();
                }else{
                    starIndex.pop();
                }
            }
        }

        while(!leftIndex.isEmpty() && !starIndex.isEmpty()){
            if(leftIndex.pop() > starIndex.pop()){
                return false;
            }
        }

        return leftIndex.isEmpty();

        // for(char i : s.toCharArray()){
        //     if(i == ')' && (stack.peek() == '(' || stack.peek() == '*')){
        //         stack.pop();
        //     }else{
        //         stack.add(i);
        //     }
        // }
        
        // if(stack.isEmpty()) return true;

        // int left = 0;
        // int star = 0;
        // while(!stack.isEmpty()){
        //     if(stack.pop() == '(')  left++;
        //     else if(stack.pop() == '*')     star++;
        // }

        // if(star >= left)    return true;
        // else    return false;
    }
}