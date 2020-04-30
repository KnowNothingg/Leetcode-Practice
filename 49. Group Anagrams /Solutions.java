import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solutions {
    public static void main(String[] args) {
        String[] strs = {"tea","and","ate","eat","den"};

        List<List<String>> list = Answer2(strs);

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
        // eat != aat
        // can't use hashset to store the characters, might have duplicate letters eg: egg
    }


    // My solutions, super slow and uses a lot of memory storage
    /**
     * Runtime: 961 ms, faster than 5.01% of Java online submissions for Group Anagrams.
        Memory Usage: 200.4 MB, less than 5.26% of Java online submissions for Group Anagrams.
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        
        if(strs.length == 1){
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            answer.add(list);
            return answer;
        }

        for(int i = 0; i < strs.length; i++){
            while(strs[i] == null){
                i++;
                if(i >= strs.length)    return answer;

            }


            List<String> list = new ArrayList<>();


            int index = 0;
            int[] charMap = new int[26];
            while(index < strs[i].length()){
                charMap[strs[i].charAt(index) - 'a'] += 1;
                index++;
            }
            

            for(int j = i+1; j< strs.length; j++){
                while(strs[j] == null || strs[i] == null 
                      ||strs[i].length() != strs[j].length()){
                    j++;
                    if(j >= strs.length)    break; 
                }
                if(j >= strs.length)    break; 



                int in = 0;

                int[] map = new int[26];
                while(in < strs[j].length()){
                    map[strs[j].charAt(in) - 'a'] += 1;
                    in++;
                }

                boolean flag = true;
                for(int z = 0; z < 26; z++){
                    if(charMap[z] != map[z]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    list.add(strs[j]);
                    strs[j] = null;
                }
            }
            list.add(strs[i]);
            strs[i] = null;

            answer.add(list);
        }

        return answer;

    }

    public static List<List<String>> Answer2(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();
        

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String st = String.valueOf(chars);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<String>());
            }
            map.get(st).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}