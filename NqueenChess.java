package placement;

public class NqueenChess {

	public static void main(String[] args) {
		boolean[][] box=new boolean[5][5];
		Queen2D(box,0,0,0,box.length,"");

	}
	public static void Queen2D(boolean box[][],int row ,int col,int currQ,int totalQ,String ans) {
		if(currQ==totalQ) {
			System.out.println(ans);
			return;
		}
		if(col==box[0].length) {
			col=0;
			row++; 
			
		}
		if(row==box.length) return;
		if(isItSafeToPlace(box,row,col)) {
			box[row][col]=true;
			Queen2D(box,row+1,0,currQ+1,totalQ,ans+"("+row+","+col+")");
			box[row][col]=false;
		}
		Queen2D(box,row,col+1,currQ,totalQ,ans);
	}
	
	// 2nd method for only n queen
	public static void NQueen2D(boolean box[][],int row ,int currQ,int totalQ,String ans) {
		if(currQ==totalQ) {
			System.out.println(ans);
			return;
		}
//		if(col==box[0].length) {
//			col=0;
//			row++; 
//			
//		}
		if(row==box.length) return;
		for(int col=0;col<box[0].length;col++) {
			
			if(isItSafeToPlace(box,row,col)) {
				box[row][col]=true;
				NQueen2D(box,row+1,currQ+1,totalQ,ans+"("+row+","+col+")");
				box[row][col]=false;
			}
		}
		
	}
	
	private static boolean isItSafeToPlace(boolean[][] box, int row, int col) {
		//check if there is queen in vertically upward
		int r=row-1;
		int c=col;
		while(r>=0) {
			if(box[r][c]) return false;
			r--;
		}
		
		//horizontal left
		r=row; c=col-1;
		while(c>=0) {
			if(box[r][c]) return false;
			c--;
		}
		
		//diagonal left
		r=row-1; c=col-1;
		while(r>=0 && c>=0) {
			if(box[r][c]) return false;
			r--;c--;
		}
		
		//diagonal right
		r=row-1; c=col+1;
		while(r>=0 && c<box[0].length) {
			if(box[r][c]) return false;
			r--;
			c++;
		}
		return true;
	}

}
