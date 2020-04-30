class Solutions{
    public static void main(String[] args) {
        String S = "bad";
        int[] shifts = {10,20,30};
        System.out.println(shiftingLetters(S, shifts));
    }

    public static String shiftingLetters(String S, int[] shifts) {
        int index = 0;
        String answer = "";
        int shift = 0;

        for (int x: shifts){
            shift = (x + shift) % 26;
        }

        for(char c : S.toCharArray()){
            answer += (char)((c - 'a' + shift) % 26 + 'a');
            shift = Math.floorMod(shift - shifts[index], 26);
            index++;
        }

        return answer;
    }
}