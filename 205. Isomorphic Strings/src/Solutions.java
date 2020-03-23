import java.util.HashMap;

public class Solutions {
	public static void main(String[] args) {
		String s1 = "paper";
		String s2 = "title";
		System.out.println(isIsomorphic(s1, s2));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        int num1 = 0;
        int num2 = 0;
        String S1 = "";
        String S2 = "";
        for(int i = 0; i < s.length(); i++) {
        	if(!map1.containsKey(s.charAt(i))) {
        		map1.put(s.charAt(i), num1);
        		S1 += num1;
        		num1++;
        	}else {
        		S1 += map1.get(s.charAt(i));
        	}
        	
        	if(!map2.containsKey(t.charAt(i))) {
        		map2.put(t.charAt(i), num2);
        		S2 += num2;
        		num2++;
        	}else {
        		S2 += map2.get(t.charAt(i));
        	}
        }
        
        if(S1.equals(S2)) {
        	return true;
        }else {
        	return false;
        }
    }

}
