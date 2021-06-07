package com.everis.elevator;

public class Elevator {
	private boolean direction;
	private int currentFloor;
	private boolean idle = false;

	/**
	 * Move the elevator to selected Floor
	 * 
	 * @param selectFloor
	 */
	public void Move(int selectFloor) {
		if (selectFloor == currentFloor) {
			idle = false;
		} else {
			changeStatus();
			direction = true;
			setCurrentFloor(selectFloor);
			Stop();
		}

	}

	public void Stop() {
		changeStatus();
		direction = false;
	}

	public void changeStatus() {
		if (idle == true) {
			idle = false;
		} else {
			idle = true;
		}

	}

	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @param currentFloor
	 *            the currentFloor to set
	 */
	private void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public Elevator(int currentFloor) {
		this.currentFloor = 0;
	}

}
