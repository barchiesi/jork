package zork.thegame.model.type;

import zork.thegame.model.inter.ObjectImpl;

public abstract class Heal extends ObjectImpl {

	private int hit;

	public Heal(String name, String descr, int weight) {
		super(name, descr, weight);
	}

	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

}
