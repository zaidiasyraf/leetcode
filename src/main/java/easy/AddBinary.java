package easy;

public class AddBinary {

    // https://leetcode.com/problems/add-binary/
    public static void main(String[] args) {
        String a = addBinary("11", "1");
        String b = addBinary("1010", "1011");
        int k = 0;
    }

    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

}
