package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public BoardException (String mensagem) {
		super(mensagem);
		// pq o método super já tem uma string que ele passa sempre;
	}

}
