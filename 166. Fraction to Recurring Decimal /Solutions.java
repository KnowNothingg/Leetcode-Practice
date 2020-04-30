import java.util.HashMap;

public class Solutions {

    // If the reminder is the same, then the result is repeating
    // So use hashmap<Reminder, Index> find out where it is repeating, then do ();
    // Also, use stringbuilder

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(-50, 8));
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0)     return "0";

        StringBuilder sb = new StringBuilder();


        if(numerator>0&&denominator<0 || numerator < 0&&denominator>0){
            sb.append("-");
        }

        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);
        sb.append(n/d);

        n %= d;
        if(n == 0)  return sb.toString();


        sb.append(".");



        HashMap<Long, Integer> map = new HashMap<>();
        map.put(n, sb.length());    // add into map with it's index
        while(n != 0){
            n *= 10;
            sb.append(n / d);
            n %= d;
            if(map.containsKey(n)){
                int index = map.get(n);
                sb.insert(index, '(');
                sb.append(")");
                break;
            }else{
                map.put(n, sb.length());
            }
        }


        return sb.toString();
    }
}