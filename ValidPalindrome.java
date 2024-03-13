public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        String clean=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] ch=clean.toCharArray();
        char[] temp=new char[ch.length];
        int p=0;
        for(int i=ch.length-1;i>=0;i--){
            temp[p]=ch[i];
            p++;
        }
        String result=new String(temp);
        System.out.println(result);
        if(clean.equals(result)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s="race a car";
        System.out.println(isPalindrome(s));
    }
}
