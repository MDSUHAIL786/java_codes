package placement;

import java.util.ArrayList;

public class MazePath {
	public static void main(String args[]) {
		System.out.print(Maze(0,0,2,2));
	}
	public static ArrayList<String> Maze(int currR,int currC,int endR,int endC){
		if(currR==endR && currC==endC) {
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		if(currR>endR || currC>endC) {
			ArrayList<String> temp=new ArrayList<>();
			
			return temp;
		}
		ArrayList<String> rslt=new ArrayList<>();
		ArrayList<String> horzntl=Maze(currR,currC+1,endR,endC);
		for(String s:horzntl) {
			rslt.add("H"+s);
		}
		ArrayList<String> vrtl=Maze(currR+1,currC,endR,endC);
		for(String k:vrtl) {
			rslt.add("V"+k);
		}
		return rslt;
	}

}
