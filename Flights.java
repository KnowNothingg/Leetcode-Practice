class Flights{
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = 0;
        }

        for(int i = 0; i < bookings.length; i++){
            for(int j = bookings[i][0] - 1; j < bookings[i][1]; j++){
                answer[j] += bookings[i][2];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] bookings = {{2,3,10},{2,3,20},{2,5,25}};
        int[] arr = corpFlightBookings(bookings, 5);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}