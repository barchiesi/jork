package zork.thegame.model.inter;

public interface Object {

	//return a message containing the effect of the object
	String use();
	
	int getWeight();

	void setWeight(int w);

	String getPropDescr();

	void setPropDescr(String propDescr);

	String getName();

	void setName(String name);

}
