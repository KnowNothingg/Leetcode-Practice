/*
    Write a function that reverses a string. The input string is given as an array of characters char[].

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    You may assume all the characters consist of printable ascii characters.
*/



class reverseString {
    public static void main(String[] args){
        char[] test1 = { 'h','e','l','l','o'};
        char[] test2 = {'H','a','n','n','a','h'};
        reverseString(test1);
    }

    public static void reverseString(char[] s) {
        System.out.print("Output: [");
        reverseStringHelper(s, 0);
        for(int i = 0; i < s.length; i++){
            System.out.print("\"" + s[i] + "\", ");
        }
        System.out.print("]");
    }
    
    public static void reverseStringHelper(char[] s, int index){
        if(index >= s.length/2){
            return;
        }
       char temp = s[index];
       s[index] = s[s.length - 1 - index];
       s[s.length - 1 - index] = temp;
       reverseStringHelper(s, ++index);
    }
}

