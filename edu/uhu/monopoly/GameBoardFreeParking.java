
package edu.uhu.monopoly;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		IOwnable jail = new JailCell();
		FreeParkingCell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
