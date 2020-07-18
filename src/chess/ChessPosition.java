package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	public ChessPosition(char column, int row2) {
		if(column < 'a' || column > 'h' || row2 < 1 || row2 > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are form a1 to h8.");
		}
		this.column = column;
		this.row = row2;
	}
	
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), (8 - position.getRow()));
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
