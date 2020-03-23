import java.util.Hashtable;

// Algorithm

// Find the count of each character, and use it to sort the string by count.

// If at some point the number of occurrences of some character is greater than (N + 1) / 2, the task is impossible.

// Otherwise, interleave the characters in the order described above.

public class Solutions {
    public static void main(String[] args) {
        String s1 = "aab"; // return aba
        String s2 = "aaab"; // return null

        System.out.println(reorganizeString(s1));
    }

    public static String reorganizeString(String S) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        String maxChar = Character.toString(Count(table, S));
        String answer = "";
        int maxNum = table.get(Count(table, S));
        
        if(maxNum < S.length() - maxNum + 1){
            return "";
        }else{
            for(int i = 0; i < S.length(); i++){
                if(maxNum != 0){
                    answer += maxChar;
                    maxNum--;
                }
                while(S.charAt(i) != maxChar.charAt(0)){
                    i++;
                }
                answer += S.charAt(i) + "";
            }
            return answer;

        }        
    }

    public static Character Count(Hashtable<Character, Integer> table, String S) {
        table.clear();
        char maxChar = S.charAt(0);
        int max = Integer.MIN_VALUE;
        for (char c : S.toCharArray()) {
            if (!table.containsKey(c)) {
                table.put(c, 1);
            } else {
                int num = table.get(c);
                table.put(c, num+1);
                if(Math.max(table.get(c), max) != max){
                    max = Math.max(table.get(c), max);
                    maxChar = c;
                }
            }
        }

        return maxChar;
    }
}


// Solution 2: 
// Greedy with Heap