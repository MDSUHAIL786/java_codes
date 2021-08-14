package placement;

public class Nknights {

	public static void main(String[] args) {
		knights(new boolean[3][3],0,0,0,2,"");

	}
	public static void knights(boolean box[][],int row ,int col,int currK,int totalK,String ans) {
		if(currK==totalK) {
			System.out.println(ans);
			return;
		}
		if(col==box[0].length) {
			row++; 
			col=0;
			
		}
		if(row==box.length) return;
		if(isItSafeToPlace(box,row,col)) {
			box[row][col]=true;
			knights(box,row,col+1,currK+1,totalK,ans+"("+row+","+col+")");
			box[row][col]=false;
		}
		knights(box,row,col+1,currK,totalK,ans);
	}
	private static boolean isItSafeToPlace(boolean[][] box, int row, int col) {
		int rowArr[]= {-2,-2,-1,-1};
		int colArr[]= {-1,1,-2,2};
		for(int i=0;i<4;i++) {
			int r=row+rowArr[i];
			int c=col+colArr[i];
			if(r>=0 && r<box.length && c>=0 && c<box[0].length) {
				if(box[r][c])
					return false;
			}
		}

		return true;
	}

}
