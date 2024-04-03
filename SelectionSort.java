import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int indexOfMin = i;
            int j = i+1;
            while (j < arr.length) {
                if (arr[indexOfMin] > arr[j]) {
                    indexOfMin = j;
                }
                j++;
            }
            if(indexOfMin!=i){
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 54, 1, 32, 11, 26, 65, 31, 2, 8, 9 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
