public class AmstrongNumber {
    public static String checkArmstrong(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            ++count;
        }
        int sum = 0;
        temp = num;
        while (temp > 0) {
            sum = sum + (int) (Math.pow(temp % 10, count));
            temp = temp / 10;
        }
        if (sum == num) {
            return "yes";
        }
        return "no";
    }

    public static void main(String[] args) {
        int num = 1634;
        System.out.println(checkArmstrong(num));
    }
}
