package edu.uhu.monopoly;

public interface IOwnable {

	Player getProprietary();

	void setProprietary(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}