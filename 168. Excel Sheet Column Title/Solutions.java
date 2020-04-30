public class Solutions{
    // need to do "n--"
    /*
    Because we always use 'A' + n%26, 'A' is virtually stand for 1 at here, we have to deduct 1 before doing this operation.
eg. if n%26 == 1 now, we definitely need to append A at current iteration, however, 'A' + 1 will give us 'B', 
so we need 'A' + 0 to get correct result.


I think the reason we do n-- is that number 0 is not included in this sheet. 
We can consider this transformation as base-26. 
However, classic base-26 consists of number from 0 to 25, 
and in this case we have numbers from 1 to 26. Now n-- seems intuitive and reasonable.
    */
    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }

    public static String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            sb.append((char)('A' + (n % 26)));
            n = n / 26;
        }
        return sb.reverse().toString();
        // return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));

    }
}