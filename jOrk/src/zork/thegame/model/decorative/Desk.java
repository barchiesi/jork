package zork.thegame.model.decorative;

public class Desk extends Decorative {

	static String descrizione = "La tua scrivania e' stata ribaltata. Tutti i tuoi documenti sono rovesciati a terra, ci vorra' un bel po di tempo per rimettere tutto in ordine.";
	
	public Desk() {
		super("Scrivania", descrizione, 100);
	}

	@Override
	public String use() {
		return "Non puoi usare questo oggetto.";
	}
	
	
}
