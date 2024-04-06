import java.util.ArrayList;
import java.util.List;

public class WordContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for (String c : words) {
            if (c.contains(String.valueOf(x))) {
                list.add(i);
                i++;
            } else {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = { "leet", "code" };
        System.out.println(findWordsContaining(words, 'e'));
    }
}
