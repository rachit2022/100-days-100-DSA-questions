import java.util.ArrayList;
import java.util.List;

public class SeflDividingNumber {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean a = true;
            while (temp > 0) {
                int rem = temp % 10;
                if (rem == 0 || i % rem != 0) {
                    a = false;
                }
                temp = temp / 10;
            }
            if (a) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
