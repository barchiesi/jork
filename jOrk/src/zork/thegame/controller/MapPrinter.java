package zork.thegame.controller;

import zork.thegame.model.Room;

public class MapPrinter {
	/* Array containing room chars */
	private static char rooms[] = { 'S', ' ', 'A', ' ', ' ', ' ', ' ', ' ' };

	public static void printMap(Room room, int elevFloor) {
		/* Char holding value of room before displaying it */
		char previous = rooms[room.getPosition() - 1];
		/* Replace blank with asterisk for current position */
		rooms[room.getPosition() - 1] = '*';
		/* Remove elevator symbol if on different floor */
		if (elevFloor != room.getFloor())
			rooms[2] = ' ';
		/* Depending on current floor display appropriate layout */
		switch (room.getFloor()) {
		case 1:
			layoutFirstFloor();
			break;
		case 2:
			layoutSecondFloor();
			break;
		case 3:
			layoutThirdFloor();
			break;
		}
		/* Remove player position for future map invocation */
		rooms[room.getPosition() - 1] = previous;
	}

	static void layoutFirstFloor() {
		System.out.println("1° Piano");
		System.out.println();
		System.out.println("╔═══╦═══╦═══╗");
		System.out.println("║ " + rooms[0] + " ║ " + rooms[1] + " ║ " + rooms[2] + " ║");
		System.out.println("╠═ ═╬═ ═╬═ ═╣");
		System.out.println("║ " + rooms[3] + "   " + rooms[4] + "   " + rooms[5] + " ║");
		System.out.println("╠═ ═╬═ ═╬═══╝");
		System.out.println("║ " + rooms[6] + " ║ " + rooms[7] + " ║");
		System.out.println("╚═══╩═══╝");
		System.out.println();
	}

	static void layoutSecondFloor() {
		System.out.println("2° Piano");
		System.out.println();

		System.out.println("╔═══╦═══╦═══╗");
		System.out.println("║ " + rooms[0] + " ║ " + rooms[1] + "   " + rooms[2] + " ║");
		System.out.println("╠═ ═╬═ ═╬═══╝");
		System.out.println("║ " + rooms[3] + "   " + rooms[4] + " ║");
		System.out.println("╚═══╩═══╝");
		System.out.println();
	}

	static void layoutThirdFloor() {
		System.out.println("3° Piano");
		System.out.println();
		System.out.println("╔═══╦═══╦═══╗");
		System.out.println("║ " + rooms[0] + "   " + rooms[1] + "   " + rooms[2] + " ║");
		System.out.println("╚═══╬═ ═╬═══╝");
		System.out.println("    ║ " + rooms[3] + " ║");
		System.out.println("    ╚═══╝");
		System.out.println();
	}
}
