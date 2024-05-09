import java.util.Arrays;

public class MaximizeHappiness {

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int n = happiness.length, j = 0;

        for (int i = n - 1; i >= n - k; --i) {
            happiness[i] = Math.max(happiness[i] - j++, 0);
            res += happiness[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 2;
        System.out.println(maximumHappinessSum(nums, k));
    }
}
