package placement;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[]{0,66,-5,44,22,-5,-8};
		System.out.println(Arrays.toString(Bubble(arr)));
		
	}
	public static int[] Bubble(int[] a) {
		int i=0,n=a.length;
		while(i<n) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
			i++;
		}
		return a;
	}

}
