package element.mobile;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import element.Permeability;
import element.Sprite;
import model.IMap;

/**
 * <h1>The MyVehicle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class MyLorann extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite sprite = new Sprite('H', "lorann_b.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite spriteTurnLeft = new Sprite('H', "lorann_l.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite spriteTurnRight = new Sprite('H', "lorann_r.png");

	/** The Constant spriteExplode. */
	private static final Sprite spriteExplode = new Sprite('H', "monster_1.png");

	private static final Sprite spriteTurnUp = new Sprite('H', "lorann_u.png");

	private static final Sprite spriteTurnDown = new Sprite('H', "lorann_b.png");

	private static final Sprite spriteHG = new Sprite('H', "lorann_ul.png");

	private static final Sprite spriteHD = new Sprite('H', "lorann_ur.png");

	private static final Sprite spriteBG = new Sprite('H', "lorann_bl.png");

	private static final Sprite spriteBD = new Sprite('H', "lorann_br.png");

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
	public MyLorann(final int x, final int y, final IMap road) throws IOException {
		super(x, y, sprite, road, Permeability.BLOCKING);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteExplode.loadImage();
		spriteTurnUp.loadImage();
		spriteTurnDown.loadImage();
		spriteHG.loadImage();
		spriteHD.loadImage();
		spriteBG.loadImage();
		spriteBD.loadImage();
	}

	private long tempsActuel;

	private static int i = 0;

	private static long tempsPrecedent = System.currentTimeMillis();

	private static final Sprite[] album = { spriteTurnRight, spriteBD, spriteTurnDown, spriteBG, spriteTurnLeft,
			spriteHG, spriteTurnUp, spriteHD };

	@Override
	public final void moveHG() {
		super.moveHG();
		this.setSprite(spriteHG);
	}

	@Override
	public final void moveHD() {
		super.moveHD();
		this.setSprite(spriteHD);
	}

	@Override
	public final void moveBG() {
		super.moveBG();
		this.setSprite(spriteBG);
	}

	@Override
	public final void moveBD() {
		super.moveBD();
		this.setSprite(spriteBD);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
	 */
	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
	}

	@Override
	public final void moveUp() {
		super.moveUp();
		this.setSprite(spriteTurnUp);
	}

	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteTurnDown);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
	 */
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteTurnRight);
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
	 */
	@Override
	public final void die() {
		super.die();
		this.setSprite(spriteExplode);

		File Clap = new File("Music/4.wav");
		PlaySound(Clap);
	}

	static void PlaySound(File Sound) {

		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

		} catch (Exception e) {

		}
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
	 */
	/*
	 * @Override public final void doNothing() { super.doNothing();
	 * this.setSprite(sprite); }
	 */

	@Override
	public final void doNothing() {
		tempsActuel = System.currentTimeMillis();
		super.doNothing();
		for (int a = 0; a < 10; a++) {
			if (tempsActuel - tempsPrecedent >= 1) {
				this.setSprite(album[i]);
				tempsPrecedent = tempsActuel;
				if (i >= album.length - 1) {
					i = 0;
				} else {
					i++;
				}
			}
		}
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

	public void moveSort() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void State(int lorannX, int lorannY, Boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveSpell(int lorannx, int loranny) throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
