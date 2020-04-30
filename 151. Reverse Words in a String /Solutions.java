import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        String s1 = "a good   example";
        System.out.println(anotherAnswer(s1));
    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String answer = "";
        s = s.trim();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            if(!words[i].isBlank()){
                stack.add(words[i]);
            }
        }

        while(!stack.empty()){
            answer += stack.pop() + " ";
        }
        return answer.trim();
    }


    // From the discussion, looks like use StringBuilder is faster than just adding a string
    /*
    StringBuilder o = new StringBuilder();
        for(int j = words.length - 1; j >= 0; --j) {
            if(!words[j].trim().isEmpty()) {
                o.append(words[j]).append(" ");
            }
        }
        return o.toString().trim();
    */
    public static String anotherAnswer(String s){
        s = s.trim();
        String[] words = s.split(" ");
        String answer = "";
        for(int i = words.length - 1; i >= 0; i--){
            if(!words[i].isBlank()){
                answer+= words[i] + " ";
            }
        }
        return answer.trim();
    }
}