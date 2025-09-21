package leetcode.array;

import java.util.Arrays;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class Ex2_MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double tbc = findMedianSortedArrays(nums1, nums2);
        System.out.println(tbc);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > 0 || nums2.length > 2) {
            System.out.println("Mảng không hợp lệ");
            return 0;
        }
        // gộp 2 mảng
        int length = nums1.length + nums2.length;
        int[] arrnew = new int[length];
        for (int i = 0; i < nums1.length; i++) {
            arrnew[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            arrnew[nums1.length] = nums2[j];
        }
        System.out.println(Arrays.toString(arrnew));
        // sx mảng
        // tính tổng các phần tử --> trả về
        return 0;
    }
}
