package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main( String[] args )
    {
        TwoSum twoSum = new TwoSum();

        System.out.println(twoSum(new int[] {2,7,11,15}, 9));
    }

    /**
     * The concept is we will check the difference number between the target and current iterating number
     * If exist then return
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> foundMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int lookingFor = target - currentNum;
            if (foundMap.containsKey(lookingFor)) {
                result[0] = foundMap.get(lookingFor);
                result[1] = i;
                return result;
            } else {
                foundMap.put(currentNum, i);
            }
        }
        return result;
    }
}
