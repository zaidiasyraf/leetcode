package easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix.longestCommonPrefix(new String[]{});
    }

    public static String longestCommonPrefix(String[] strs) {
        String toReturn = "";
        String prefix = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();
        if (strs.length < 2) {
            return prefix;
        }
        for (String str : strs) {
            if (str.equals(prefix)) {
                toReturn = prefix;
                continue;
            }
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() < 1) {
                    return "";
                }
            }
            toReturn = prefix;
        }
        return toReturn;
    }

}
