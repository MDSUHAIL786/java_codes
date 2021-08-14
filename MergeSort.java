package placement;
import java.util.*;
public class MergeSort {
	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(100));
		}
		for(int i:arr) System.out.print(i+"  ");
		System.out.println("your sorting array is given below : ");
		for(int j:sorting(arr,0,n-1)) System.out.print(j+"  ");
		o.close();   
	
	}
	public static int[] merging(int a[],int b[]) {
		int n=a.length,m=b.length;
		int ans[]=new int[m+n];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(a[i]>=b[j]) {
				ans[k]=b[j];
				j++;
				k++;
			}else {
				ans[k]=a[i];
				i++;
				k++;
			}
		}
		if(i==n) {
			while(j<m) {
				ans[k]=b[j];
				j++;k++;
			}
		}else if(j==m) {
			while(i<n) {
				ans[k]=a[i];
				i++;k++;
			}
		}
		return ans;
	}
	public static int[] sorting(int arr[],int low,int high) {
		if(low==high) {
			int temp[]=new int[1];
			temp[0]=arr[low];
			return temp;
		}
		int mid=(low+high)/2;
		int[] firstHalf=sorting(arr,low,mid);
		int[] secondHalf=sorting(arr,mid+1,high);
		int[] rslt=merging(firstHalf,secondHalf);
		return rslt;
	}
	

}
