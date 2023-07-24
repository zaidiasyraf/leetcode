package easy;

public class LengthOfLastWord {

    // https://leetcode.com/problems/length-of-last-word/description/
    public static void main(String... args) {
        int a = lengthOfLastword("Hello World");
        int b = lengthOfLastword("   fly me   to   the moon  ");
        int c = lengthOfLastword("luffy is still joyboy");
        int k = 0;
    }

    public static int lengthOfLastword(String s) {
        String[] a = s.split(" ");
        return a[a.length - 1].length();
    }

}
