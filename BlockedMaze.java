package placement;

public class BlockedMaze {

	public static void main(String[] args) {
		int maze[][]= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		BlockMaze2(maze,new boolean[maze.length][maze[0].length],0,0,"");
		System.out.println("or");
		BlockMaze(maze,new boolean[maze.length][maze[0].length],0,0,"");
	}
	
	public static void BlockMaze(int[][] a,boolean visited[][],int row,int col,String ans) {
		if(row==a.length-1 && col==a[0].length-1) {
			System.out.println(ans+"("+row+","+col+")");
			return;
		}
		if(row==-1 || col==-1 || col==a[0].length || row==a.length || visited[row][col] || a[row][col]==1)
			return;
		visited[row][col]=true;
		BlockMaze(a,visited,row+1,col,ans+"("+row+","+col+")"); //downward move
		BlockMaze(a,visited,row-1,col,ans+"("+row+","+col+")"); //top move
		BlockMaze(a,visited,row,col-1,ans+"("+row+","+col+")"); //left move
		BlockMaze(a,visited,row,col+1,ans+"("+row+","+col+")"); //right move
		visited[row][col]=false;
	}
	
	
	//can be
	public static void BlockMaze2(int[][] a,boolean visited[][],int row,int col,String ans) {
		if(row==a.length-1 && col==a[0].length-1) {
			System.out.println(ans);
			return;
		}
		if(row==-1 || col==-1 || col==a[0].length || row==a.length || visited[row][col] || a[row][col]==1)
			return;
		
		visited[row][col]=true;
		
		BlockMaze2(a,visited,row+1,col,ans+"D"); //downward move D
		BlockMaze2(a,visited,row-1,col,ans+"T"); //top move T
		BlockMaze2(a,visited,row,col-1,ans+"L"); //left move L
		BlockMaze2(a,visited,row,col+1,ans+"R"); //right move R
		
		visited[row][col]=false;
	}

}
