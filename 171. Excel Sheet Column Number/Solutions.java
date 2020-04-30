public class Solutions{
    public static void main(String[] args) {
        System.out.println(AnotherAnswer("CDA"));
    }

    public static int titleToNumber(String s) {

        int answer = 0;
        int index = 0;
        while(index < s.length()){
            int rn = 1;
            for(int i = 0; i < index; i++){
                rn *= 26;
            }
            answer += ((int)s.charAt(s.length()-1 - index) - 64) * rn;
            index++;
        }

        return answer;
    }

    public static int AnotherAnswer(String s){
        int result = 0;
        for (int i = 0; i < s.length();i++){
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}