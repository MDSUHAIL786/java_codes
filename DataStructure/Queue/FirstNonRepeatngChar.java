package placement.DataStructure.Queue;

import java.util.*;

public class FirstNonRepeatngChar {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner o=new Scanner(System.in);
		int arr[]=new int[267];
		int n=o.nextInt();
		while(n>=0) {
			char ch=o.next().charAt(0);
			sb.append(ch);
//			char upper=;
			arr[(int)ch]++;
			arr[(int)Character.toUpperCase(ch)]++;
			for(int i=0;i<sb.length();i++) {
				if(arr[sb.charAt(i)]==1) {
					if(arr[Character.toUpperCase(sb.charAt(i))]==1) {
						System.out.println(sb.charAt(i));
						break;
					}
						
					
				}
				else if(i==sb.length()-1) {
					System.out.print(-1);
				}
			}
			n--;
		}
		
		o.close();

	}
	//method 2

}
