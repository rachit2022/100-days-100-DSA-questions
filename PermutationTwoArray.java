public class PermutationTwoArray {
    public static String isPermute(int[] a, int[] b,int k) {
        if(a.length!=b.length){
            return "No";
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(a));
        for (int i = 0; i < b.length; i++) {
            for (int j = 1; j < b.length-i; j++) {
                if (b[j-1] < b[j]) {
                    int temp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(b));
        // return "No";
        String result="Yes";
        for(int i=0;i<a.length;i++){
            if(a[i]+b[i]>=k){
            }else{
                result="No";
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={2,1,3};
        int[] b={7,8,9};
        int k=10;
        System.out.println(isPermute(a, b,k));
    }
}
