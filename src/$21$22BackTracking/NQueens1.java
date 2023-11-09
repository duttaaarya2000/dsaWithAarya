package $21$22BackTracking;
//place N queens on a N*N chess-board
//TC->O(N!)
public class NQueens1{
	static int count=0;
	public static void printBoard(char board[][]) {
		System.out.println("------chess board------");
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void nQueens(char board[][],int row) {
		//base
		if(row==board.length) {
			printBoard(board);
			count++; 
			return;
		}
		//column loop
		for(int j=0;j<board.length;j++)
		{
			board[row][j]='Q';
			nQueens(board, row+1);//function call
			board[row][j]='X';//backtracking step
		}
	}
	public static void main(String args[])
	{
		int n=2;
		char board[][]=new char[n][n];
		//initialize
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				board[i][j]='X';
			}
		}
		nQueens(board,0);
		System.out.println("total ways to solve n queens="+count);
	}

}
