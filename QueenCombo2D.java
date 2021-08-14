package placement;

public class QueenCombo2D {

	public static void main(String[] args) {
		Queen2D(new boolean[3][3],0,0,0,3,"");
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
		
		box[row][col]=true;
		Queen2D(box,row,col+1,currQ+1,totalQ,ans+"("+row+","+col+")");
		box[row][col]=false;
		Queen2D(box,row,col+1,currQ,totalQ,ans);
	}

}
