import java.util.ArrayList;

public class LSWRC {

	public static void main(String[] args) {
		String s1 = "abbcbbca";	// answer 3;
		String s2 = "bbbbb";	// answer 1;
		String s3 = "pwwkew";	// answer 3;
		String s4 = "aab";		// answer 2;
		String s5 = "abcabcbb";		// answer 3;
		System.out.println(lengthOfLongestSubstring(s5));
	}

	public static int lengthOfLongestSubstring(String s) {
		ArrayList<Character> found = new ArrayList<Character>();
		
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(found.contains(c)) {
				 while(found.get(0) != s.charAt(i)) {
	                    found.remove(0);
	                }
	                found.remove(0);
			}
			
			found.add(c);
			
			max = Math.max(max, found.size());
			
		}
		return max;
	}

}
