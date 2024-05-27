public class PassThePillow {
    public static int passThePillow(int n, int time) {
        int cur = 1;
        int d = 1;
        int ela = 0;
        while (ela < time) {
            cur += d;
            if (cur == n || cur == 1) {
                d = -d;
            }
            ela++;
        }
        return cur;
    }

    public static void main(String[] args) {
        int n=4;
        int time=5;
        System.out.println(passThePillow(n,time));
    }
}
