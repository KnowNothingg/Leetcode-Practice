import java.util.Stack;

public class Solutions {
    // reverse polish notation = postfix notation
    public static void main(String[] args) {
        String[] s1 = {"2", "1", "+", "3", "*"};
        String[] s2 = {"4", "13", "5", "/", "+"};
        String[] s3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(s3));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")|| tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int num = evaluate(a, b, tokens[i]);
                stack.add(num);
            }else{
                stack.add(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }

    public static int evaluate(int a, int b, String eval){
        switch(eval){
            case("+"): return a+b;
            case("-"): return a-b;
            case("/"): return a/b;
            case("*"): return a*b;
        }

        return -1;

    }
}