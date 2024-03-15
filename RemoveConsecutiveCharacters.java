public class RemoveConsecutiveCharacters {
    public static String removeConsecutiveCharacters(String str) {
        StringBuilder result = new StringBuilder();
        char prev = str.charAt(0);
        result.append(prev);
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != prev) {
                result.append(current);
                prev = current;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(removeConsecutiveCharacters(s));
    }
}
