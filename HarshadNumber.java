public class HarshadNumber{
    public static int sumOfTheDigitsOfHarshadNumber(int n) {
        int temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        if(n%sum==0){
            return sum;
        }
        return -1;
    }
    public static void main(String[] args){
        int n=18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(n));
    }
}