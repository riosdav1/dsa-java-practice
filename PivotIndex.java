
import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(getPivotIndex(new int[] { 1, 7, 3, 6, 5, 6 })); // 3
        System.out.println(getPivotIndex(new int[] { 1, 2, 3 })); // -1
        System.out.println(getPivotIndex(new int[] { 2, 1, -1 })); // 0
    }

    private static int getPivotIndex(int[] nums) {
        int leftSum = 0;
        int arraySum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == arraySum - nums[i] - leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
