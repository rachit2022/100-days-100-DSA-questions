public class ReverseString2 {
    public static String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        if(str.length<k){
            char[] ans=new char[str.length];
            for(int i=0;i<str.length;i++){
                ans[i]=str[str.length-i-1];
            }
            return new String(ans);
        }
        for(int i=0;i<s.length();i+=(2*k)){
            int a=i;
            int b=Math.min(i+k-1, s.length()-1);
            swap(str,a,b);
        }
        String ans=new String(str);
        return ans;
    }
    
    public static void swap(char[] str, int a, int b){
        while(a<b){
            char temp=str[a];
            str[a]=str[b];
            str[b]=temp;
            a++;
            b--;
        }
    }
    public static void main(String[] args){
        String s="apple";
        System.out.println(reverseStr(s,3));
    }
}