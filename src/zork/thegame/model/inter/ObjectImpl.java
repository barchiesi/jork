package zork.thegame.model.inter;


public abstract class ObjectImpl implements Object {
	
	private int weight;
	private String name;
	private String propDescr;

	public ObjectImpl(String name, String descr, int weight) {
		this.name = name;
		this.propDescr = descr;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setWeight(int w) {
		weight = w;
	}

	@Override
	public String getPropDescr() {
		return propDescr;
	}

	@Override
	public void setPropDescr(String propDescr) {
		this.propDescr = propDescr;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
