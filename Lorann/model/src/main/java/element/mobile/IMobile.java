package element.mobile;

import java.awt.Point;

import element.IElement;
import showboard.IPawn;

public interface IMobile extends IPawn, IElement {

	/**
	 * Move up.
	 */
	void moveUp();

	/**
	 * Move left.
	 */
	void moveLeft();

	/**
	 * Move down.
	 */
	void moveDown();

	/**
	 * Move right.
	 */
	void moveRight();

	void moveUpLeft();

	void moveUpRight();

	void moveDownLeft();

	void moveDownRight();

	/**
	 * Do nothing.
	 */
	void doNothing();

	void fire();

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	@Override
	int getX();

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	@Override
	int getY();

	/**
	 * Checks if is alive.
	 *
	 * @return the alive
	 */
	Boolean isAlive();

	/**
	 * Checks if the car crashed.
	 *
	 * @return the boolean
	 */
	Boolean isCrashed(int x, int y);

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.showboard.IPawn#getPosition()
	 */
	@Override
	Point getPosition();

	void die();

	void moveMonster1(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster2(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster3(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster4(int lorannX, int lorannY) throws InterruptedException;

}
