package zork.thegame.model.weapons;

import zork.thegame.model.type.Weapon;

public class Gun extends Weapon {

	public Gun() {
		super("pistola", "gun description", 3);
		setMunitions(5);
	}

	@Override
	public String use() {
		if (getMunitions() > 0) {
			degMunition();
			return "killed. Remaining ammunitions: " + getMunitions();
		}
		return null;
	}

}
