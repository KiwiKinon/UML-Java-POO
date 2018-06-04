package element.mobile;

import java.awt.Point;

import element.Element;
import element.Permeability;
import element.Sprite;
import model.IMap;
import showboard.IBoard;

abstract class Mobile extends Element implements IMobile {

	protected int z = 1;

	/**
	 * The x.
	 */
	private Point position;

	/** The alive. */
	private Boolean alive = true;

	/** The road. */
	private IMap road;

	/** The board. */
	private IBoard board;

	Mobile(final Sprite sprite, final IMap road, final Permeability permeability) {
		super(sprite, permeability);
		this.setRoad(road);
		this.position = new Point();
	}

	/**
	 * Instantiates a new mobile.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param sprite
	 *            the sprite
	 * @param road
	 *            the road
	 * @param permeability
	 *            the permeability
	 */
	Mobile(final int x, final int y, final Sprite sprite, final IMap road, final Permeability permeability) {
		this(sprite, road, permeability);
		this.setX(x);
		this.setY(y);
	}

	Mobile(final int z, final int x, final int y, final Sprite sprite, final IMap road,
			final Permeability permeability) {
		this(sprite, road, permeability);
		this.setZ();
		this.setX(x);
		this.setY(y);
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
		this.z = 1;
	}

	@Override
	public void moveUpLeft() {
		this.setY(this.getY() - 1);
		this.setX(this.getX() - 1);
		this.setHasMoved();
		this.z = 5;
	}

	@Override
	public void moveUpRight() {
		this.setY(this.getY() - 1);
		this.setX(this.getX() + 1);
		this.setHasMoved();
		this.z = 6;
	}

	@Override
	public void moveDownLeft() {
		this.setY(this.getY() + 1);
		this.setX(this.getX() - 1);
		this.setHasMoved();
		this.z = 7;
	}

	@Override
	public void moveDownRight() {
		this.setY(this.getY() + 1);
		this.setX(this.getX() + 1);
		this.setHasMoved();
		this.z = 8;
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
		this.z = 3;
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setHasMoved();
		this.z = 2;
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
		this.z = 4;
	}

	@Override
	public void doNothing() {
		this.setHasMoved();
	}

	/**
	 * Sets the has moved.
	 */
	private void setHasMoved() {
		this.getRoad().setMobileHasChanged();
	}

	@Override
	public final int getX() {
		return this.getPosition().x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x
	 *            the new x
	 * @throws InterruptedException
	 */
	public final void setX(final int x) {
		if (this.isCrashed(x, this.getPosition().y)) {
			this.doNothing();
		} else {
			this.getPosition().x = x;
		}
	}

	@Override
	public final int getY() {
		return this.getPosition().y;
	}

	public final int setZ() {
		return this.z;
	}

	/**
	 * Sets the y.
	 *
	 * @param y
	 *            the new y, as the road is an infinite loop, there's a modulo based
	 *            on the road height.
	 * @throws InterruptedException
	 */
	public final void setY(final int y) {
		if (this.isCrashed(this.getPosition().x, y)) {
			this.doNothing();
		} else {
			this.getPosition().y = y;
		}
	}

	/**
	 * Gets the road.
	 *
	 * @return the road
	 */
	public IMap getRoad() {
		return this.road;
	}

	/**
	 * Sets the road.
	 *
	 * @param road
	 *            the new road
	 */
	private void setRoad(final IMap road) {
		this.road = road;
	}

	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	/**
	 * Dies.
	 */
	public void die() {
		this.alive = false;
		this.setHasMoved();
	}

	@Override
	public Boolean isCrashed(int x, int y) {
		return this.getRoad().getOnTheRoadXY(x, y).getPermeability() == Permeability.BLOCKING;
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position
	 *            the position to set
	 */
	public void setPosition(final Point position) {
		this.position = position;
	}

	/**
	 * Gets the board.
	 *
	 * @return the board
	 */
	protected IBoard getBoard() {
		return this.board;
	}

}
