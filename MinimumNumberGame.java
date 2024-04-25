import java.util.Arrays;

public class MinimumNumberGame {

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a = 0, b = 1;
        while (b < nums.length) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a = b + 1;
            b = a + 1;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
}
