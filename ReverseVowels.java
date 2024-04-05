public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i <= j) {
            if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' || c[i] == 'a' || c[i] == 'e'
                    || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                if ((c[j] == 'A' || c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U' || c[j] == 'a'
                        || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u')) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else if ((c[j] == 'A' || c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U' || c[j] == 'a'
                    || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u')) {
                if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' || c[i] == 'a'
                        || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                    char temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                    i++;
                    j--;
                } else {
                    i++;
                }
            } else {
                i++;
                j--;
            }
        }
        String ans = new String(c);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Hello"));
    }
}
