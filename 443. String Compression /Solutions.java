
public class Solutions {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(Anothercompress(chars));
    }

    public static int compress(char[] chars) {
        int total = 0;
        int charCount = 1;
        char current = chars[0];

        for(int i = 1; i < chars.length; i++){
            if(current != chars[i] || i == chars.length - 1){
                if(charCount == 1){
                    total++;
                }else{
                    total = total + 2;
                }
                charCount = 1;
                current = chars[i];
            }else{
                charCount++;
            }
        }

        return total;
        // Wrong answer

    }

    public static int  Anothercompress(char[] chars) {
        int i=0;
          int j = 0;
         while(i < chars.length){
       
            int count=0;
            char currChar = chars[i];
             while(i < chars.length && chars[i] == currChar){
                 count++;
                i++;
            }
            chars[j++] = currChar;
            if(count > 1){
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[j++] = c;
                }
            }
        } 
        
        return j;
        }
}