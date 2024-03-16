public class MajorityElement {
    public static int majorityElement(int[] arr){
        int maxCount=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        if(maxCount<=arr.length/2){
            return -1;
        }
        return arr[index];
    }
    public static void main(String[] args){
        int[] arr={1,1,2,1,3,5,1};
        System.out.println(majorityElement(arr));
    }
}
