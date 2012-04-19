package zork.thegame.model.type;

import zork.thegame.model.inter.ObjectImpl;

public abstract class Weapon extends ObjectImpl{

	private int damage;
	private int munitions;

	public void setMunitions(int munitions) {
		this.munitions = munitions;
	}

	public int getDamage() {
		return damage;
	}
	
	public void degMunition(){
		munitions--;
	}
	public int getMunitions(){
		return munitions;
	}
	
	public Weapon(String name, String descr, int weight) {
		super(name, descr, weight);
	}

}
