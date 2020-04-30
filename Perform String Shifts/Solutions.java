class Solutions{
    public static void main(String[] args) {
        String s = "wpdhhcj";
        
        int[][] shift = {{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
        System.out.println(stringShift(s, shift));
    }

    public static String stringShift(String s, int[][] shift) {
       int sh = 0;

       for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 0){
                sh -= shift[i][1];
            }else{
                sh += shift[i][1];
            }
       }

       String answer = "";
       sh = sh % s.length();
       if(sh == 0){
           return s;
       }else if(sh > 0){
           answer += s.substring(s.length() - sh, s.length());
           answer += s.substring(0, s.length() - sh);
       }else{
            sh = -sh;
            answer += s.substring(sh, s.length());
            answer += s.substring(0, sh);
       }

       return answer;
    }
}