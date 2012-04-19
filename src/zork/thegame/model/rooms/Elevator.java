package zork.thegame.model.rooms;

import zork.thegame.model.Room;

public class Elevator extends Room {

	private int floor = 1;
	private boolean lock = false;
	
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	
	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}

	public Elevator(String description) {
		super(description, 3, 1);
	}
	
}
