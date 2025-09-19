package leetcode.array;

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
        int target = 9;
        twoSum(ints, target);
    }

    public static int[] twoSum(int[] nums, int target) {

        // 2+15, 2+11, 2+7
        // 7+15,7+11
        //11+15


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            int sum = nums[i];
            for (int j = 0; j < nums.length - i; j++) {
//                int index = nums.length - i - j;
                System.out.print(nums[j] + " " + sum + " | ");
            }
        }
        return new int[]{};
    }
}
