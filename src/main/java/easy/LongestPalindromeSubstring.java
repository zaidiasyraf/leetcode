package easy;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;


        for (int i = 0; i < s.length(); i++) {
           int odd = calculateLongestPalindrome(s, i, i);
           int even = calculateLongestPalindrome(s, i, i+1);

           int max = Math.max(odd, even);
           if (max > end - start) {
               start = i - (max - 1) / 2;
               end = i + max/2;
           }
        }
        return s.substring(start, end + 1);
    }

    public static int calculateLongestPalindrome(String s, int start1, int start2) {
        while (start1 >= 0 && start2 < s.length() && s.charAt(start1) == s.charAt(start2)) {
            start1--;
            start2++;
        }
        return start2 - start1 - 1;
    }

}
