package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

    }

    /**
     * Idea is to separate string by char and iterate
     * Each iteration will just add the chat value
     * except for previous value < current value
     * where we will subtract previous value 2 times and add current value
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolValueMap = new HashMap<>();
        symbolValueMap.put('I', 1);
        symbolValueMap.put('V', 5);
        symbolValueMap.put('X', 10);
        symbolValueMap.put('L', 50);
        symbolValueMap.put('C', 100);
        symbolValueMap.put('D', 500);
        symbolValueMap.put('M', 1000);

        Character lastChar = null;
        int total = 0;
        for (char c : s.toCharArray()){
            int currentValue = symbolValueMap.get(c);
            if (lastChar == null) {
                total = total + currentValue;
            } else {
                int lastValue = symbolValueMap.get(lastChar);
                if (lastValue < currentValue) {
                    total = total - lastValue - lastValue + currentValue;
                } else {
                    total = total + currentValue;
                }
            }
            lastChar = c;
        }
        return total;
    }

}
