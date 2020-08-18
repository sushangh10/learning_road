/**
 * @Author sushanghai
 * @Date 2020/8/18
 */
public class TwoSum {
    public int[] twoSumByLoop(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int firstAdd = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int secondAdd = nums[j];
                if (firstAdd + secondAdd == target) {
                    return new int[]{i, j};
                }
            }
        }
        // assume it must got result
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSumByLoop(nums, target));
    }
}
