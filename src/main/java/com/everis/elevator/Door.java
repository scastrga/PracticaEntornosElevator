package com.everis.elevator;

public class Door {

	private boolean closed = true;
	
	public void open() {
		closed = false;
	}
	
	public void close() {
		closed = true;
	}

	/**
	 * @return the closed
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * @param closed the closed to set
	 */
	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public Door(boolean closed) {
		super();
		this.closed = closed;
	}
	
	
	
}
