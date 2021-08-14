package placement;

public class CoinChange {
	static int count=0;
	public static void main(String[] args) {
		coin(new int[]{2,3,5,6},10,0,"");
		System.out.println();
		System.out.println("permutation is give below :");
		coinP(new int[]{2,3,5,6},10,"");

	}
	public static void coin(int detmnt[],int amt,int lastUsedIdx,String ans) {
		if(amt==0) {
			System.out.println(ans);
			return;
		}
		if(amt<0) return;
		for(int i=lastUsedIdx;i<detmnt.length;i++) {
			coin(detmnt,amt-detmnt[i],i,ans+detmnt[i]);
		}
	}
	// permutation 
	public static void coinP(int detmnt[],int amt,String ans) {
		if(amt==0) {
			count++;
			System.out.println(count+" "+ans);
			return;
		}
		if(amt<0) return;
		for(int i=0;i<detmnt.length;i++) {
			coinP(detmnt,amt-detmnt[i],ans+detmnt[i]);
		}
	}
	

}
