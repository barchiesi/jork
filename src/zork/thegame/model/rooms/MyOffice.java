package zork.thegame.model.rooms;

import zork.thegame.model.Room;

public class MyOffice extends Room {

	boolean firstTime = true;
	String firstDescription = "Un forte dolore alla spalla ti riporta alla conoscenza. Ti trovi nel tuo ufficio e capisci subito che c'e' qualcosa che non va. I vetri delle finestre sono stati rotti e la tua scrivania e' stata ribaltata. Mentre stai riprendendo conoscenza senti squillare il tuo telefonino dietro la scrivania..";
	String description = "Ti trovi nel tuo tanto amato ufficio. I vetri delle finestre sono stati rotti e la tua scrivania e' stata ribaltata.";
	
	public MyOffice() {
		super("My office. START", 2, 1);
	}
	
	public String getDescription() {
		if (firstTime) {
			firstTime = false;
			return firstDescription + ".\n" + exitString();
		}
		return description + ".\n" + exitString();
	}
}
