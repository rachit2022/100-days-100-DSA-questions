public class NumberOfChangingKeys {
    public static int countKeyChanges(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i - 1))) {
                continue;
            }
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        String s="aAbBcC";
        System.out.println(countKeyChanges(s));
    }
}
