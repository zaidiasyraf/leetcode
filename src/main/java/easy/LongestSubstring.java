package easy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if (map.size() > longest) {
                longest = map.size();

            }
        }
        return longest;
    }
}
