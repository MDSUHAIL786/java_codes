package placement;

public class QueenCombination {
	static int count=0;
	public static void main(String args[]) {
		QueenP(new boolean[4],0,2,"",0);
		QueenBox(new boolean[4],0,2,"",0);
	}
	//queen respect approach
	public static void QueenP(boolean boxes[],int CurrQueen,int totalQueen,String ans,int lastBoxUsed) {
		if(CurrQueen==totalQueen) {
			count++;
			System.out.println(count+" " +ans);
			return;
		}
		for(int i=lastBoxUsed;i<boxes.length;i++) {
			if(boxes[i]==false) {
				
				boxes[i]=true;
				QueenP(boxes,CurrQueen+1,totalQueen,ans+"Q"+CurrQueen+"B"+i+" ",i);
				boxes[i]=false;  //undo i.e backtracking
			}
		}
	}
	//box respect approach
	public static void QueenBox(boolean boxes[],int CurrQueen,int totalQueen,String ans,int boxidx) {
		if(CurrQueen==totalQueen) {
			System.out.println(ans);
			return;
		}
		if(boxidx==boxes.length) return;
		boxes[boxidx]=true;
		QueenBox(boxes,CurrQueen+1,totalQueen,ans+"b"+boxidx,boxidx+1);
		boxes[boxidx]=false;
		QueenBox(boxes,CurrQueen,totalQueen,ans,boxidx+1);
		
	}
}
