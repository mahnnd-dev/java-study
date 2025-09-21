package ai;

import java.util.Arrays;

/**
 * Mảng (Arrays) - Ngày 2: Thao tác Chèn và Xóa trong Mảng
 */
public class Day2 {
    /**
     * Khai báo mảng int: {1, 2, 3, 4, 5}.
     * Chèn giá trị 10 vào index 1 (kết quả mong đợi: [1, 10, 2, 3, 4, 5]).
     * Xóa phần tử tại index 3 (sau chèn, index 3 là 3; kết quả sau xóa: [1, 10, 2, 4, 5]).
     * In mảng sau mỗi thao tác bằng Arrays.toString().
     * Thêm kiểm tra nếu vị trí chèn/xóa hợp lệ (in lỗi nếu không)
     */
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int index = 1;
        int value = 10;
        int[] ints1 = insertion(index, value, ints);
        System.out.println(Arrays.toString(ints1));
        int indexDel = 3;
        System.out.println(Arrays.toString(deleteion(indexDel, ints1)));

    }


    public static int[] insertion(int insIndex, int insValue, int[] ints) {
        // chèn thêm 1 phần tử nên +1
        int lengthNew = ints.length + 1;
        if (insIndex < 0 || insIndex >= lengthNew) {
            System.out.println("insIndex không hợp lệ");
            return new int[]{};
        }
        int[] intsNew = new int[lengthNew];
        // duyệt các phần từ mảng cũ vào mảng mới
        System.arraycopy(ints, 0, intsNew, 0, ints.length);
        // set giá trị mới vào index
        intsNew[insIndex] = insValue;
        // hoán đổi index array cũ
        for (int i = 0; i < ints.length; i++) {
            if (i >= insIndex) {
                intsNew[i + 1] = ints[i];
            }
        }
        return intsNew;
    }

    public static int[] deleteion(int insIndex, int[] ints) {
        int[] intsNew = new int[ints.length - 1];
        if (insIndex < 0 || insIndex > intsNew.length) {
            System.out.println("insIndex không hợp lệ");
        }
        for (int i = 0; i < intsNew.length; i++) {
            if (i >= insIndex) {
                intsNew[i] = ints[i + 1];
            }
            if (i < insIndex) {
                intsNew[i] = ints[i];
            }
        }
        return intsNew;
    }
}
