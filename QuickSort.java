package placement;

import java.util.Scanner;

public class QuickSort {
	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(100));
		}
		for(int i:arr) System.out.print(i+"  ");
		System.out.println("your sorting array is given below : ");
		quick(arr,0,n-1);
		for(int j:arr) System.out.print(j+"  ");
		o.close(); 
	}
	public static void quick(int ar[],int low,int high) {
		int idx=(low+high)/2,i=low,j=high;
		int pivot=ar[idx];
		if(low>=high) {
			return;
		}
		while(i<=j) {
			while(ar[i]<pivot) i++;
			while(ar[j]>pivot) j--;
			if(i<=j) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;j--;
			}
		}
		quick(ar,low,j);
		quick(ar,i,high);
	}
	

}
