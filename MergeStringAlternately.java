public class MergeStringAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            str.append(i);
            i++;
            str.append(j);
            j++;
        }
        while (i < word1.length()) {
            str.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word1 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
