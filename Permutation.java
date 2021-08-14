package placement;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		String str="abc";
		System.out.print(permt(str));
		System.out.println();
		permtPrint(str,"");

	}
	public static ArrayList<String> permt(String s) {
		if(s.length()==0) {
			ArrayList<String> r=new ArrayList<>();
			r.add("");
			return r;
		}
		char ch=s.charAt(0);
		String sub=s.substring(1);
		ArrayList<String> ans=permt(sub);
		ArrayList<String> rslt=new ArrayList<>();
		for(String i:ans) {
			for(int j=0;j<=i.length();j++) {
				String val=i.substring(0,j)+ch+i.substring(j);
				rslt.add(val);
			}
		}
		return rslt;
	}
	//print output
	public static void permtPrint(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String t=s.substring(0,i)+s.substring(i+1);
			permtPrint(t,ans+ch);
		}
	}

}
