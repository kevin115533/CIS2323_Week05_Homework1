public class ChessBoard{
	private int[][] board = new int[8][8];
	
	public void printBoard(){
		for(int i = 0; i<8;i++){
			for(int j=0;j<8;j++){
			System.out.println(board[i][j]);
			}
		}
	}
	
	public void setSpot(int x, int y){
		board[x][y]=1;
		
	}
	
	/*public boolean getSpot{
		return board;
	}*/
}