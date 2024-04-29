import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sum1 = 0, sum2 = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 = sum1 + aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            sum2 = sum2 + bobSizes[i];
            map.put(bobSizes[i], 1);
        }

        int k = (sum1 - sum2) / 2;

        for (int i = 0; i < aliceSizes.length; i++) {
            if (map.containsKey(aliceSizes[i] - k))
                return new int[] { aliceSizes[i], aliceSizes[i] - k };
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args){
        int[] alice={1,1};
        int[] bob={2,2};
        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }
}