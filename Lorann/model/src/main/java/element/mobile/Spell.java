package element.mobile;

import java.io.IOException;

import element.Permeability;
import element.Sprite;
import model.IMap;

/**
 * <h1>The MyVehicle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class Spell extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite Red = new Sprite('s', "fireball_4.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite Purple = new Sprite('s', "fireball_3.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite Blue = new Sprite('s', "fireball_2.png");

	/** The Constant spriteExplode. */
	private static final Sprite Green = new Sprite('s', "fireball_1.png");

	private static final Sprite Yellow = new Sprite('s', "fireball_5.png");

	private static final Sprite Disapear = new Sprite('s', "bone.png");

	public Boolean state = false;

	public int X;
	public int Y;
	public int choice = 1;

	/**
	 * Instantiates a new my vehicle.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param road
	 *            the road
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public Spell(final int x, final int y, final IMap road) throws IOException {
		super(x, y, Disapear, road, Permeability.BLOCKING);
		Red.loadImage();
		Purple.loadImage();
		Blue.loadImage();
		Green.loadImage();
		Yellow.loadImage();
		Disapear.loadImage();

	}

	@SuppressWarnings("unused")
	private long tempsActuel;

	@SuppressWarnings("unused")
	private static int i = 0;

	@SuppressWarnings("unused")
	private static long tempsPrecedent = System.currentTimeMillis();

	@SuppressWarnings("unused")
	private static final Sprite[] sort = { Red, Purple, Blue, Green, Yellow,

	};

	@Override
	public final void State(final int lorannX, final int lorannY, Boolean state) {
		this.state = state;
		this.X = lorannX;
		this.Y = lorannY;
	}

	@Override
	public final void moveSort() {
		doNothing();

		if (state = true) {
			this.getPosition().x = X;
			this.getPosition().y = Y;

			for (int a = 0; a < 10; a++) {
				switch (choice) {
				case 1:
					if (this.isCrashed(this.getPosition().x + 1, this.getPosition().y)) {
						this.choice = 2;
					} else {
						this.moveRight();
					}
					break;

				case 2:
					if (this.isCrashed(this.getPosition().x + 1, this.getPosition().y)) {
						this.choice = 1;
					} else {
						this.moveLeft();
					}
					break;
				}

			}
		}

	}

	@Override
	public final void moveHG() {
		super.moveHG();
		// this.setSprite(spriteHG);
	}

	@Override
	public final void moveHD() {
		super.moveHD();
		// this.setSprite(spriteHD);
	}

	@Override
	public final void moveBG() {
		super.moveBG();
		// this.setSprite(spriteBG);
	}

	@Override
	public final void moveBD() {
		super.moveBD();
		// this.setSprite(spriteBD);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
	 */
	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(Red);
	}

	@Override
	public final void moveUp() {
		super.moveUp();
		// this.setSprite(spriteTurnUp);
	}

	@Override
	public final void moveDown() {
		super.moveDown();
		// this.setSprite(spriteTurnDown);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
	 */
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(Green);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
	 */
	@Override
	public final void die() {
		super.die();
		// this.setSprite(spriteExplode);

	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
	 */
	@Override
	public final void doNothing() {
		super.doNothing();
		this.getPosition().y = 0;
		this.getPosition().x = 0;
		this.setSprite(Disapear);
	}

	/*
	 * public final void doNothing() { tempsActuel = System.currentTimeMillis();
	 * super.doNothing(); for(int a = 0; a < 10; a++) { if(tempsActuel -
	 * tempsPrecedent >= 1) { this.setSprite(sort[i]); tempsPrecedent = tempsActuel;
	 * if (i >= sort.length-1) { i = 0; } else { i++; } } } }
	 */

	@Override
	public void moveMonster1(int lorannX, int lorannY) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveMonster2(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveMonster3(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveMonster4(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
