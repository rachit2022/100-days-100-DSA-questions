public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 1 ? true : false;
    }

    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
    }
}
