import java.util.*;
public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {

        List<String> folder = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            } else if (logs[i].equals("../")) {
                if (folder.size() > 1)
                    folder.remove(folder.size() - 1);
                else
                    folder.clear();
            } else
                folder.add(logs[i]);
        }

        return folder.size();
    }
    public static void main(String[] args){
        String[] log={"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(log));
    }
}
