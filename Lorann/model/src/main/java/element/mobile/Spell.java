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

	private long tempsActuel;

	private static int i = 0;

	private static long tempsPrecedent = System.currentTimeMillis();

	private static final Sprite[] spell = { Red, Purple, Blue, Green, Yellow,

	};

	@Override
	public final void State(final int lorannX, final int lorannY, Boolean state) {
		this.state = state;
		this.getPosition().x = lorannX;
		this.getPosition().y = lorannY;
	}

	@Override
	public final void moveSpell(int lorannX, int lorannY) {
		if (this.state == true) {
			tempsActuel = System.currentTimeMillis();

			for (int a = 0; a < 10; a++) {
				if (tempsActuel - tempsPrecedent >= 300) {

					switch (choice) {
					case 1:

						if (this.isCrashed(this.getPosition().x + 1, this.getPosition().y)) {
							this.moveLeft();
							this.choice = 2;
						} else {
							this.moveRight();
							if (this.getPosition().x == lorannX && this.getPosition().y == lorannY) {
								state = false;
							}
						}

						break;

					case 2:
						if (this.isCrashed(this.getPosition().x - 1, this.getPosition().y)) {
							this.moveRight();
							this.choice = 1;
						} else {
							this.moveLeft();
							if (this.getPosition().x == lorannX && this.getPosition().y == lorannY) {
								state = false;
							}
						}

						break;
					}
					tempsPrecedent = tempsActuel;
				}
			}
		} else {
			this.getPosition().y = 0;
			this.getPosition().x = 0;
			this.setSprite(Disapear);
		}

	}

	@Override
	public final void moveHG() {
		super.moveHG();
	}

	@Override
	public final void moveHD() {
		super.moveHD();
	}

	@Override
	public final void moveBG() {
		super.moveBG();
	}

	@Override
	public final void moveBD() {
		super.moveBD();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
	 */
	@Override
	public final void moveLeft() {
		super.moveLeft();
		tempsActuel = System.currentTimeMillis();
		// super.doNothing();
		for (int a = 0; a < 10; a++) {
			if (tempsActuel - tempsPrecedent >= 1) {
				this.setSprite(spell[i]);
				tempsPrecedent = tempsActuel;
				if (i >= spell.length - 1) {
					i = 0;
				} else {
					i++;
				}
			}
		}
	}

	@Override
	public final void moveUp() {
		super.moveUp();
	}

	@Override
	public final void moveDown() {
		super.moveDown();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
	 */
	@Override
	public final void moveRight() {
		super.moveRight();
		tempsActuel = System.currentTimeMillis();
		for (int a = 0; a < 10; a++) {
			if (tempsActuel - tempsPrecedent >= 1) {
				this.setSprite(spell[i]);
				tempsPrecedent = tempsActuel;
				if (i >= spell.length - 1) {
					i = 0;
				} else {
					i++;
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
	 */
	@Override
	public final void die() {
		super.die();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
	 */
	@Override
	public final void doNothing() {
		super.doNothing();

	}

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

	public void moveSpell() throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
