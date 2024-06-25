package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position = null;
	}
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		//considera mat uma matriz quadrada
		boolean[][] mat = possibleMoves(); 
		
		for (int i = 0; i < mat.length; i+=1) {
			
			for (int j = 0; j < mat.length; j+=1) {
				
				if(mat[i][j] == true) {
					return true;
				}
				
			}
		
		} 
		return false;
	}
	
	
}
