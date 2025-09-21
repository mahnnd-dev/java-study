package ai;

import java.util.Arrays;

/**
 * Mảng (Arrays) - Ngày 3: Tìm kiếm trong Mảng
 */
public class Day3 {
    /**
     * Khai báo mảng int: {5, 1, 4, 2, 3}.
     * Viết hàm linearSearch để tìm index của giá trị 4 (kết quả mong đợi: 2).
     * Sort mảng bằng Arrays.sort(), rồi dùng binarySearch để tìm index của giá trị 2 (kết quả sau sort: index 1).
     * Thử tìm giá trị không tồn tại (ví dụ 6), return -1.
     * Thêm kiểm tra nếu mảng rỗng, in "Mảng rỗng".
     */
    public static void main(String[] args) {
        int[] ints = {5, 1, 4, 2, 3};
        System.out.println(linearSearch(ints, 4));
        System.out.println(binarySearch(ints, 2));
        System.out.println(binarySearch(ints, 6));
        ints = new int[]{};
        System.out.println(binarySearch(ints, 6));
    }

    public static int linearSearch(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Yêu cầu mảng sorted (tăng dần).
     * Đặt low = 0, high = length-1.
     * Tính mid = (low + high) / 2.
     * Nếu arr[mid] == key, return mid.
     * Nếu arr[mid] < key, tìm nửa phải (low = mid + 1).
     * Nếu arr[mid] > key, tìm nửa trái (high = mid - 1).
     * Lặp đến khi low > high, return -1.
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr.length <= 0) {
            System.out.println("Mang rong");
            return 0;
        }
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
