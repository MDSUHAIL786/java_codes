package placement;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]=new int[]{0,66,-5,44,22,-5,-8};
		System.out.println(Arrays.toString(Selection(arr)));

	}
	public static int[] Selection(int a[]) {
		int i=0,n=a.length;
		while(i<n-1) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[min]>a[j]) min=j;
			}
			
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			i++;
		}
		return a;
	}

}
