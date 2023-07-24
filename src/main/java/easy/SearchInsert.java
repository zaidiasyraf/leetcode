package easy;

public class SearchInsert {

    // https://leetcode.com/problems/search-insert-position/
    public static void main (String... args) {
        int a = searchInsert(new int[]{1, 3, 5, 6}, 5);
        int b = searchInsert(new int[]{1, 3, 5, 6}, 2);
        int c = searchInsert(new int[]{1, 3, 5, 6}, 7);
        int k = 0;
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

}
