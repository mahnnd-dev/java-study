package leetcode.array;

import java.util.Arrays;

public class MainArray {
    /**
     * Hãy viết chương trình Java thực hiện:
     * <p>
     * Khai báo mảng int: {1, 2, 3, 4, 5}.
     * Chèn giá trị 10 vào index 1 (kết quả mong đợi: [1, 10, 2, 3, 4, 5]).
     * Xóa phần tử tại index 3 (sau chèn, index 3 là 3; kết quả sau xóa: [1, 10, 2, 4, 5]).
     * In mảng sau mỗi thao tác bằng Arrays.toString().
     * Thêm kiểm tra nếu vị trí chèn/xóa hợp lệ (in lỗi nếu không).
     * <p>
     * Hãy code và chạy trong 2 giờ hôm nay. Trong buổi học Ngày 3, tôi sẽ kiểm tra bằng bài tập tương tự. Nếu có thắc mắc về ví dụ Java hoặc bài kiểm tra, hãy hỏi ngay!
     */
    public static void main(String[] args) {
        int[] intSort = {5, 1, 4, 2, 3};
        int value = 4;
        System.out.println("Linear search cho 4: " + linearSearch(intSort, value)); // 2

        Arrays.sort(intSort);
        System.out.println("Mảng sau sort: " + Arrays.toString(intSort)); // [1,2,3,4,5]

        value = 2;
        System.out.println("Binary search cho 2: " + binarySearch(intSort, value)); // 1

        value = 6;
        System.out.println("Binary search cho 6: " + binarySearch(intSort, value)); // -1

        // Test bổ sung: Mảng rỗng
        int[] empty = {};
        System.out.println("Binary search trong mảng rỗng: " + binarySearch(empty, 0)); // In "Mảng rỗng" và -1

        // Test bổ sung: Giá trị ở giữa, đầu, cuối
        System.out.println("Binary search cho 3: " + binarySearch(intSort, 3)); // 2
        System.out.println("Binary search cho 1: " + binarySearch(intSort, 1)); // 0
        System.out.println("Binary search cho 5: " + binarySearch(intSort, 5)); // 4

        // Test với trùng lặp
        int[] dup = {1, 2, 2, 3};
        Arrays.sort(dup); // Đã sorted
        System.out.println("Binary search cho 2 (trùng): " + binarySearch(dup, 2)); // Có thể return 1 hoặc 2 (tùy, nhưng OK nếu tìm thấy)

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

    public static int linearSearch(int[] ints, int value) {
        if (ints.length <= 0) {
            System.out.println("Mảng rỗng");
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                return i;
            }
        }
        return -1;
    }



}
