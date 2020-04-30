class Solutions{
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));

    }

    public static int rangeBitwiseAnd(int m, int n) {
        if(m == 0){
            return 0;
        }
        int moveFactor = 1;
        while(m != n){
            m >>= 1;
            n >>= 1;
            moveFactor <<= 1;
        }
        return m * moveFactor;
    }
}