package ai;

import java.util.Arrays;

/**
 * Ngày 4: Thuật toán Sắp xếp Cơ bản trong Mảng
 */
public class Day4 {
    /**
     * Khai báo mảng int: {12, 11, 13, 5, 6}.
     * Viết hàm bubbleSort để sắp xếp tăng dần, in mảng sau sort ([5,6,11,12,13]).
     * Viết hàm insertionSort cho cùng mảng, in sau sort (tương tự).
     * Test với mảng rỗng {} (không sort, in "Mảng rỗng").
     * Test với mảng đã sort {1,2,3}, đảm bảo không thay đổi.
     */
    public static void main(String[] args) {
        int[] ints = {12, 11, 13, 5, 6};
        System.out.println(Arrays.toString(bubbleSort(ints)));
    }

    /**
     * Logic: Duyệt mảng nhiều lần, so sánh đôi một phần tử liền kề, hoán đổi nếu sai thứ tự. Phần tử lớn "nổi" lên cuối.
     * Tối ưu: Nếu không hoán đổi trong một lượt, dừng sớm.
     */
    public static int[] bubbleSort(int[] ints) {

        boolean swapped = true;
        while (swapped) {
            for (int i = 0; i < ints.length; i++) {
                int temp = ints[i];

            }
        }
        return new int[]{};
    }

    public static int[] insertionSort(int[] ints) {
        return new int[]{};
    }

}
