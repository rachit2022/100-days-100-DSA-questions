import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum == 0)
            return "0";
        String arr[] = new String[nums.length];
        int k = 0;
        for (int i : nums) {
            arr[k++] = i + "";
        }
        int n = nums.length;
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;
                return yx.compareTo(xy);
            }
        });
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++)
            sb.append(arr[i]);

        return sb + "";
    }

    public static void main(String[] args) {
        int[] nums = { 10, 2 };
        System.out.println(largestNumber(nums));
    }
}
