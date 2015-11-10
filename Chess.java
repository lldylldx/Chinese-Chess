package com.chaustar.chinesechess

//Chess.java

/**
 * This is a abstract class.
 * <p>
 * 
 * <p>
 * @param  url  an absolute URL giving the base location of the image
 * @return      the image at the specified URL
 * @see         Image
 */

public abstract class Chess {

	private int color; 
	private char x;
	private char y;
	private ChessPosition cp;
	
/**
 * 
 * <p>
 *
 * <p>
 * @param  url  an absolute URL giving the base location of the image
 * @return      the image at the specified URL
 * @see         Image
 */
	public abstract ChessPosition move();	
	
	public abstract ChessPosition regret();

}
