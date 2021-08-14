package placement;

public class QueenPermutation {
	static int count=0;
	public static void main(String args[]) {
		QueenP(new boolean[4],0,2,"");
	}
	public static void QueenP(boolean boxes[],int CurrQueen,int totalQueen,String ans) {
		if(CurrQueen==totalQueen) {
			count++;
			System.out.println(count+" " +ans);
			return;
		}
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]==false) {
				
				boxes[i]=true;
				QueenP(boxes,CurrQueen+1,totalQueen,ans+"Q"+CurrQueen+"B"+i+" ");
				boxes[i]=false;  //undo i.e backtracking
			}
		}
	}
}

