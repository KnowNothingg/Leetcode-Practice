public class Solutions {
    // you need treat n as an unsigned value

    public static void main(String[] args) {
        int n = 43261596;
        // System.out.println(reverseBits(n));

        System.out.println(n & 1);
    }

    public static int reverseBits(int n) {
        int result = 0;

        System.out.println(n & 1);
        for(int i = 0; i < 32; i++){
            result += n & 1;                // get the last digit of n
            n >>>= 1;   // CATCH: must do unsigned shift            // shift right
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;                        // shift left for every digit but not the last one
        }

        return result;
    }
}