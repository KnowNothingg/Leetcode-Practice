public class Solutions{

    public static void main(String[] args) {
        
    }

    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            int last = n & 1;
            if(last == 1)  count++;
            n >>>= 1;
        }

        return count;
    }
}