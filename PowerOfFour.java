public class PowerOfFour {
    
    public static boolean isPowerOfFour(int num){
        while(num>1 && num%4==0){
            num=num/4;
        }
        return num==1;
    }
    
    public static void main(String[] args){
        int num=16;
        System.out.println(num);
    }
}
