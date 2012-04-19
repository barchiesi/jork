package zork.thegame.model.decorative;

public class Window extends Decorative {

	static String descrizione = "I vetri della finestra sono stati rotti e il vento gelido ti fa venire la pelle d'oca. Chissa come e' successo.";
	
	public Window() {
		super("Finestra", descrizione, 100);
	}

	@Override
	public String use() {
		return "La scrivania e' troppo pesante per essere usata.";
	}
	
	
}
