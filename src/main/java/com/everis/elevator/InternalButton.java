package com.everis.elevator;

public class InternalButton extends Button {
	public InternalButton(boolean lighted, boolean pushed) {
		super(lighted, pushed);
		// TODO Auto-generated constructor stub
	}

	private int floorNumber;

	public int pushButton(int floorNumber) {
		pushed = true;
		this.floorNumber = floorNumber;
		return this.floorNumber;

	}

	/**
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

}
