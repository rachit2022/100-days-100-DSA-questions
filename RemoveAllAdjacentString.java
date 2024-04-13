import java.util.Stack;
public class RemoveAllAdjacentString {

    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        st.push(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        while (st.size() != 0) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
}
