package App;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;


public class Prog {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			
			UI.printBoard(chessMatch.getPieces());
			System.out.println("\nSource: ");
			ChessPosition source = UI.readChessPosition(sc);
			System.out.println("\nTarget:");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	
	}

}
