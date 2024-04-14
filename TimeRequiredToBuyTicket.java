public class TimeRequiredToBuyTicket {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2 };
        int k = 2;
        System.out.println(timeRequiredToBuy(arr, k));
    }
}
