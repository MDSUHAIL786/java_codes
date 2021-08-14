package placement;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		int n=10;
		System.out.println(Path(n,0));
	}
	public static ArrayList<String> Path(int n,int curr){
		if(curr==n) {
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		if(curr>n) {
			ArrayList<String> temp=new ArrayList<>();
//			temp.add("");
			return temp;
		}
		ArrayList<String> r=new ArrayList<>();
		
		for(int dice=1;dice<=6;dice++) {
			ArrayList<String> rslt=Path(n,curr+dice);
			for(String j:rslt) {
				r.add(dice+j);
			}
		}
		return r;
	}
	//print
	public static void print(int curr,int end) {
		
	}

}
