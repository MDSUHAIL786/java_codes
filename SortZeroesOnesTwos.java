package placement;
import java.util.Arrays;
public class SortZeroesOnesTwos {

	public static void main(String[] args) {
		int arr[]=new int[]{2,1,2,1,2,1,2,1,0,0,0,1,2,1,0,0,0,1,2,1,2,1};
		sort(arr);

	}
	public static void sort(int arr[]) {
		int low=0,high=arr.length-1,mid =0;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				mid++;
				low++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
		    }
	    }
		System.out.println(Arrays.toString(arr));
    }
}


