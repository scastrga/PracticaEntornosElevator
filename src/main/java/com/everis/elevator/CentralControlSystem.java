package com.everis.elevator;

public class CentralControlSystem {
	Door door = new Door(true);
	InternalButton iButton = new InternalButton(false, false);
	ExternalButton eButton = new ExternalButton(false, false);
	Elevator elevator = new Elevator(0);

	public void selectDirection(int currentFloor) {
		if (eButton.isPushed()) {
			eButton.switchLight();
			elevator.Move(currentFloor);
			door.open();
			eButton.switchLight();
			eButton.unPush();
			if (iButton.isPushed()) {
				iButton.switchLight();
				door.close();
				elevator.Move(iButton.getFloorNumber());
				iButton.switchLight();
				iButton.unPush();
				door.open();
			}
		}
		door.close();
	}

	public void controlCurrentFlow() {
		elevator.getCurrentFloor();
	}

}
