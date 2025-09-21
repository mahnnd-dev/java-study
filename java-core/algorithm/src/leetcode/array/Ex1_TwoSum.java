package leetcode.array;

import java.util.Arrays;

/**
 * Cho một mảng số nguyên và một số nguyên, trả về các chỉ số của hai số sao cho chúng cộng lại với mục tiêu.numstarget
 * Bạn có thể giả định rằng mỗi đầu vào sẽ có chính xác một giải pháp và bạn có thể không sử dụng cùng một phần tử hai lần.
 * Bạn có thể trả về câu trả lời theo bất kỳ thứ tự nào.
 * <p>
 * Ví dụ 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Ví dụ 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Ví dụ 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Ex1_TwoSum {
    /**
     * Chú ý
     * for (int i = 0; i < nums.length; i++) {
     * System.out.print(nums[i] + " ");
     * }
     * In ra tăng dần 0 --> n
     * <p>
     * for (int i = 0; i < nums.length; i++) {
     * int index = nums.length - 1 - i;
     * System.out.print(nums[index] + " ");
     * }
     * In ra giảm dần n --> 0
     */

    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int[] ints1 = {3, 2, 4};
        int[] ints2 = {3, 3};
        int target = 9;
        int target1 = 6;
        int[] twoSum = twoSum(ints, target);
        int[] twoSum1 = slution(ints1, target1);
        int[] twoSum2 = slution(ints2, target1);
        System.out.println(Arrays.toString(twoSum));
//        System.out.println(Arrays.toString(twoSum1));
//        System.out.println(Arrays.toString(twoSum2));
    }

    public static int[] slution(int[] nums, int target) {
// duyệt toàn bộ các phần tử theo chiều i --> n
        for (int i = 0; i < nums.length; i++) {
            // duyệt toàn bộ các phần tử theo chiều n --> j
            // j=1+i --> loại phần tử đầu tiên vì là chính nó
            for (int j = 1 + i; j < nums.length; j++) {
                int index = nums[i] + nums[j];
                if (index == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            //  duyệt toàn bộ các phần tử theo chiều i+1 --> n
            for (int j = i; j < nums.length; j++) {
                int index = i - j;
                if (nums[index] + nums[j] == target) {
                    return new int[]{index, j};
                }
            }
        }
        return new int[]{};
    }
}
