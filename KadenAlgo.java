package placement;

import java.util.Scanner;

public class KadenAlgo {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
//			arr[i]=(int)(Math.random()*(100));
			arr[i]=o.nextInt();
		}
		for(int i:arr) System.out.print(i+"  ");
		System.out.println();
		System.out.println(kadens(arr));
		o.close();

	}
	public static int kadens(int arr[]) {
		int i=0,curr=0;
		while(i<arr.length) {
			int temp=arr[i]+curr;
			if(temp>0) {
				curr+=arr[i];
			}else curr=0;
			i++;
		}
		return curr;
	}

}
