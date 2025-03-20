package edu.uhu.monopoly;

public class GoToJailCell extends Cell {
	

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		IOwnable jail = (IOwnable)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
	}
}
