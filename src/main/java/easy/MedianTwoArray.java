package easy;

import java.util.Arrays;

public class MedianTwoArray {

    public static void main(String[] args) {

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i =0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (mergedArray.length % 2 == 0) {
            int middle = mergedArray.length /2;
            int first = mergedArray[middle - 1];
            int second = mergedArray[middle];
            return (double) (first + second) / 2;
        } else {
            return mergedArray[(mergedArray.length / 2)];
        }
    }

}
