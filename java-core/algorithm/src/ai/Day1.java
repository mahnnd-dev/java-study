package ai;

import java.util.Arrays;

/**
 * Mảng (Arrays) - Ngày 1: Giới thiệu về Mảng và Các Thao tác Cơ bản
 */
public class Day1 {
    /**
     * Khai báo một mảng chứa 5 chuỗi tên người (ví dụ: ["Alice", "Bob", "Charlie", "David", "Eve"]).
     * Truy cập và in ra phần tử thứ 3 (index 2).
     * Cập nhật phần tử đầu tiên thành "Anna".
     * Duyệt qua mảng và in ra mỗi tên kèm index của nó.
     * Tính và in ra độ dài mảng.
     */
    public static void main(String[] args) {
        String[] strings = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println(strings[2]);
        strings[0] = "Anna";
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);
    }
}
