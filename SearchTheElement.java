import java.util.ArrayList;
import java.util.List;

public class SearchTheElement {
    public static List<Integer> searchTheElement(List<Integer> Arr, List<Integer> e) {
		// Write your code here
		List<Integer> result=new ArrayList<>();
		for(int element:e){
			int index=binarySearch(Arr,element);
			result.add(index!=-1 ? index:-1);
		}
		return result;
	}
	public static int binarySearch(List<Integer> arr, int target){
		int left=0;
		int right=arr.size()-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(arr.get(mid)==target){
				return mid;
			}else if(arr.get(mid)<target){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return -1;
	}

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(7);
        arr.add(9);
        arr.add(11);
        arr.add(12);
        arr.add(45);
        List<Integer> e=new ArrayList<>();
        e.add(9,7);
        System.out.println(searchTheElement(arr, e));
    }
}
