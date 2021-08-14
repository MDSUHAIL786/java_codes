package placement;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]=new int[]{0,66,-5,44,22,-5,-8};
		System.out.println(Arrays.toString(Insertion(arr)));

	}
	public static int[] Insertion(int a[]) {
		int j=0,n=a.length;
		for(int i=1;i<n;i++){
			int val=a[i];
		    j=i-1;
			while(j>=0 && a[j]>val) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=val;
			
		}
		return a;
	}

}


