package easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
    }

    /**
     * The concept is we will reverse the int, the return the equal
     * We reverse the number by dividing by 10 and get the reminder
     * Put the number infront by multiplying by 10 and redo above process again
     * until we get input = 0
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversedNum = 0;
        int input = x;
        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input = input / 10;
        }
        return x == reversedNum;
    }

}
