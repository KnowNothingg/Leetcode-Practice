class Solutions{
    public static void main(String[] args) {
        String S = "y#fo##f";
        String T = "y#f#o##f";
        System.out.println(twoPointers(S, T));
    }

    // Can use stack, when see #, pop the first element
    public static boolean backspaceCompare(String S, String T) {
        String s1 = "";
        for(char i : S.toCharArray()) {
            if(i == '#' && s1.length()!= 0){
                s1 = s1.substring(0, s1.length() - 1);
            }else if(i != '#'){
                s1 += i;
            }
        }

        String s2 = "";
        for(char i : T.toCharArray()) {
            if(i == '#'  && s2.length()!= 0){
                s2 = s2.substring(0, s2.length() - 1);
            }else if(i != '#'){
                s2 += i;
            }
        }

        return s1.equals(s2);
    }

    // Going backwords, when see a #, skip the next char
    public static boolean twoPointers(String S, String T){
        String s1 = "", s2 = "";
        int skip = 0, i = S.length() - 1;

        while(i >= 0){
            if(S.charAt(i) == '#'){
                skip++;
                i--;
            }else if(skip > 0){
                skip--;
                i--;
            }else{
                s1 += S.charAt(i);
                i--;
            }
        }

        skip = 0;
        i = T.length() - 1;
        while(i >= 0){
            if(T.charAt(i) == '#'){
                skip++;
                i--;
            }else if(skip > 0){
                skip--;
                i--;
            }else{
                s2 += T.charAt(i);
                i--;
            }
        }

        return s1.equals(s2);
    }
}