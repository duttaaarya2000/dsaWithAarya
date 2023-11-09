package $21$22BackTracking;
//place N queens on a N*N chess-board such that no 2 queens can attack each other
//TC->O(N!)
public class NQueens2{
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
			//checking whether queen is safe to place
			if (isSafe(board,row,j)) {
				board[row][j] = 'Q';
				nQueens(board, row + 1);//function call
				board[row][j] = 'X';//backtracking step
			}
		}
	}
	private static boolean isSafe(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		//vertically up
		for(int i=row-1;i>=0;i--)
		{
			if(board[i][col]=='Q')
			{
				return false;
			}
		}
		//diagonal left up
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
		{
			if(board[i][j]=='Q')
			{
				return false;
			}
		}
		//diagonally right up
		for(int i=row-1,j=col+1;i>=0&&j<=board.length-1;i--,j++)
		{
			if(board[i][j]=='Q')
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int n=4;
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
