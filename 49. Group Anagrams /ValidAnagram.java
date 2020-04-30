import java.util.Arrays;
import java.util.HashMap;

// 242. Valid Anagram
// A similar questions to group anagrams
// 
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram3(s, t));
    }


    // Use hashMap to keep track the times each char appears
    // slow, O(n) 27 ms
    // 43.4 MB, memory 
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;

        HashMap<Character, Integer> table = new HashMap<>();

        for(Character c : s.toCharArray()){
                table.put(c, table.getOrDefault(c, 0) + 1);
        }

        for(Character c : t.toCharArray()){
            int count = table.getOrDefault(c, 0);
            if(count == 0)  return false;
            table.put(c, table.get(c) - 1);
        }

        return true;
    }

    // Use sortting to compare if two arrays are the same
    // 11 ms

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length())    return false;

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);
    }

    // 6 ms,
    public static boolean isAnagram3(String s, String t){
        if(s.length() != t.length())    return false;
        int[] chars = new int[26];

        for(char c : s.toCharArray()){
            chars[c - 'a'] += 1;
        }

        for(char c : t.toCharArray()){
            chars[c - 'a'] -= 1;
        }

        for(int i : chars){
            if(i != 0)  return false;
        }

        return true;
    }
}