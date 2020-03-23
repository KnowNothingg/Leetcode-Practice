//input n which is a integer < 1000000000
//output, the min action to achive(hop) to n from 0

//actions: each hop you can choose between two actions
//1: increment 1 
//2: times 2 e.g 5*2 = 10
//e.g test case to 20 would be 
//0 ->1 ->2 ->4 ->8 ->16 ->17 ->18 ->19 ->20
//but this is not the shortest hop

/*
n = 20, 
count = 6
n = 30, count = 8
n = 100000000, count = 38
*/

class shortestHopNumberGame {
    public static void main(String[] args) {
        int test = 100000000;
        System.out.println("From " + test + " to 0: " + numberGame(test));
    }

    public static int numberGame(int n) {
        return numberGameHelper(n, 0);
    }

    public static int numberGameHelper(int n, int count){
        if(n == 0){
            return count;
        }else {
            if(n%2 == 0){
                n = n/2;
            }else{
                n = n - 1;
            }
            return numberGameHelper(n, ++count);
        }
    }
}
