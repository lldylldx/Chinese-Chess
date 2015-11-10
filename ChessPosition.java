package com.chaustar.chinesechess

//ChessPosition.java

public class ChessPosition {

	private int x;
	private int y;
	
	public int getH() { return x };
	public int getV() { return y };
	
	public boolean isEqual(ChessPosition cp);
}
