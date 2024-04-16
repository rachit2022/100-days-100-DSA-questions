public class LCM {

    public static int findLCM(int n1, int n2, int n3) {
        int max = Math.max(Math.max(n1, n2), n3);
        for (int i = max;; i++) {
            if (i % n1 == 0 && i % n2 == 0 && i % n3 == 0) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int n1 = 5, n2 = 10, n3 = 15;
        System.out.println(findLCM(n1, n2, n3));
    }
}
