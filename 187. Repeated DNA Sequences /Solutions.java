import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solutions {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAAAAAAAAA";

        List<String> answer = findRepeatedDnaSequences(s);

        for(String t: answer){
            System.out.println(t);
        }
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> answer = new ArrayList<String>();

        if(s.length() < 10) return answer;

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < s.length() - 9; i++){
            String sub = s.substring(i, i+10);
            if(map.containsKey(sub)){
                map.put(sub, map.get(sub) + 1);
                if(map.get(sub) == 2){  // if seen at the second time, add, otherwise, it is already added. 
                    answer.add(sub);
                }
            }else{
                map.put(sub, 1);
            }
        }

        return answer;
    }
}