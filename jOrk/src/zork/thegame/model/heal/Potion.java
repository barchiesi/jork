package zork.thegame.model.heal;

import zork.thegame.model.type.Heal;

public class Potion extends Heal {

	public Potion() {
		super("pozione", "potion description", 1);
		setHit(5);
	}

	@Override
	public String use() {
		return "potion message "+ getHit();
	}

}
