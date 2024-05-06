public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();

        int n = num;

        while (n >= 1000) {
            ans.append("M");
            n -= 1000;
        }
        while (n >= 900) {
            ans.append("CM");
            n -= 900;
        }
        while (n >= 500) {
            ans.append("D");
            n -= 500;
        }
        while (n >= 400) {
            ans.append("CD");
            n -= 400;
        }
        while (n >= 100) {
            ans.append("C");
            n -= 100;
        }
        while (n >= 90) {
            ans.append("XC");
            n -= 90;
        }
        while (n >= 50) {
            ans.append("L");
            n -= 50;
        }
        while (n >= 40) {
            ans.append("XL");
            n -= 40;
        }
        while (n >= 10) {
            ans.append("X");
            n -= 10;
        }
        while (n >= 9) {
            ans.append("IX");
            n -= 9;
        }
        while (n >= 5) {
            ans.append("V");
            n -= 5;
        }
        while (n >= 4) {
            ans.append("IV");
            n -= 4;
        }
        while (n > 0) {
            ans.append("I");
            n -= 1;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int num=12;
        System.out.println(intToRoman(num));
    }
}
