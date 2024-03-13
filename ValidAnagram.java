import java.util.Arrays;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);
        Arrays.sort(ch1);
        String s2=new String(ch1);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s1="rat";
        String s2="car";
        System.out.println(isAnagram(s1,s2));
    }
}