import java.util.Arrays;

public class SumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] { 1, 2, 3, 4 }))); // [1,3,6,10]
        System.out.println(Arrays.toString(runningSum(new int[] { 1, 1, 1, 1, 1 }))); // [1,2,3,4,5]
        System.out.println(Arrays.toString(runningSum(new int[] { 3, 1, 2, 10, 1 }))); // [3,4,6,16,17]
    }

    private static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }

        return sums;
    }
}
