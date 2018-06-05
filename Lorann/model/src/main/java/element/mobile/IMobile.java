package element.mobile;

import java.awt.Point;

import element.IElement;
import showboard.IPawn;

/**
 * <h1>The Interface IMobile.</h1>
 *
 * @author Jade
 * @version 0.1
 * @see IPawn
 * @see IElement
 */
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
     * @throws InterruptedException 
     */
    void moveDown() throws InterruptedException;

    /**
     * Move right.
     * @throws InterruptedException 
     */
    void moveRight() throws InterruptedException;

    /**
     * Do nothing.
     * @throws InterruptedException 
     */
    void doNothing() throws InterruptedException;

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
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    Point getPosition();

	void moveHG();

	void moveHD();

	void moveBG();

	void moveBD();

	void die();

	void moveMonster1(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster2(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster3(int lorannX, int lorannY) throws InterruptedException;

	void moveMonster4(int lorannX, int lorannY) throws InterruptedException;

	//void openDoor();

}
