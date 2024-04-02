import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12,54,1,32,11,26,65,31,2,8,9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
