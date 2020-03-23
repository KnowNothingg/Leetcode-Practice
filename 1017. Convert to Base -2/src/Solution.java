
public class Solution {
	public static void main(String[] args) {
		System.out.println(baseNeg2(4));
	}
	
	public static String baseNeg2(int N) {
        String s = "";
        int sign = 1;
        while (N != 0)
        {
          int d = Math.abs(N % (-2));
          s += d + "";
          if(sign == -1) {
        	  d += 2;
        	  N += 1;
          }
          N /= (2 * sign);
          sign *= -1;
        }
        
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb = sb.reverse();
		
		if(N == 0)	return "0";
        
        return sb.toString();
    }

}
