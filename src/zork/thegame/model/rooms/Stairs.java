package zork.thegame.model.rooms;

import zork.thegame.model.Room;

public class Stairs extends Room {
	private int floor = 1;
	
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Stairs(String description) {
		super("stairs description", 1, 1);
	}

}
