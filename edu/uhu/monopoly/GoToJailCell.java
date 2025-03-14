package edu.uhu.monopoly;

public class GoToJailCell extends Cell {
	

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public void playAction() {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		Cell jail = (Cell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
	}
}
