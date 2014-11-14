package org.eclipse.m2m.atl.emftvm.util;

public class UnresolvedElementException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5741863191052950620L;
	
	/**
	 * Creates a new {@link UnresolvedReferenceException}
	 */
	public UnresolvedElementException() {
		
	}
	
	/**
	 * Creates a new {@link UnresolvedReferenceException}
	 * @param msg
	 */
	public UnresolvedElementException(String msg) {
		super (msg);
	}
	
	/**
	 * Creates a new {@link UnresolvedReferenceException}
	 * @param cause
	 */
	public UnresolvedElementException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * Creates a new {@link UnresolvedReferenceException}
	 * @param msg
	 * @param cause
	 */
	public UnresolvedElementException(String msg, Throwable cause) {
		super (msg,cause);
	}
	
}
