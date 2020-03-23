public class Solution{
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}