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

	/** The Constant spriteMoveLeft. */
	private static final Sprite spriteMoveLeft = new Sprite('H', "lorann_l.png");

	/** The Constant spriteMoveRight. */
	private static final Sprite spriteMoveRight = new Sprite('H', "lorann_r.png");

	/** The Constant spriteMoveUp. */
	private static final Sprite spriteMoveUp = new Sprite('H', "lorann_u.png");

	/** The Constant spriteMoveDown. */
	private static final Sprite spriteMoveDown = new Sprite('H', "lorann_b.png");

	/** The Constant spriteMoveUpLeft. */
	private static final Sprite spriteMoveUpLeft = new Sprite('H', "lorann_ul.png");

	/** The Constant spriteMoveUpRight. */
	private static final Sprite spriteMoveUpRight = new Sprite('H', "lorann_ur.png");

	/** The Constant spriteMoveDownLeft. */
	private static final Sprite spriteMoveDownLeft = new Sprite('H', "lorann_bl.png");

	/** The Constant spriteMoveDownRight. */
	private static final Sprite spriteMoveDownRight = new Sprite('H', "lorann_br.png");

	private static final Sprite spriteExplode = new Sprite('H', "monster_1.png");

	// private static final Sprite spell1 = new Sprite('�', "fireball_1.png");

	// private static final Sprite spell2 = new Sprite('�', "fireball_2.png");

	// private static final Sprite spell3 = new Sprite('�', "fireball_3.png");

	// private static final Sprite spell4 = new Sprite('�', "fireball_4.png");

	private long tempsActuel;

	private static long tempsPrecedent = System.currentTimeMillis();

	// private static int i = 0;

	private static final Sprite[] sprites = { spriteMoveRight, spriteMoveDownRight, spriteMoveDown, spriteMoveDownLeft,
			spriteMoveLeft, spriteMoveUpLeft, spriteMoveUp, spriteMoveUpRight };
	// private static final Sprite[] spelled = { spell1, spell2, spell3, spell4, };

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
	 * @throws InterruptedException
	 */
	public MyLorann(final int x, final int y, final IMap road) throws IOException, InterruptedException {
		super(x, y, sprites[0], road, Permeability.BLOCKING);
		spriteMoveLeft.loadImage();
		spriteMoveRight.loadImage();
		spriteMoveUp.loadImage();
		spriteMoveDown.loadImage();
		spriteMoveUpLeft.loadImage();
		spriteMoveUpRight.loadImage();
		spriteMoveDownLeft.loadImage();
		spriteMoveDownRight.loadImage();
		// this.spell = new ArrayList<>();
	}

	/*
	 * private List<Spell> spell; public List<Spell> getSpell() { return this.spell;
	 * }
	 */

	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteMoveLeft);
	}

	@Override
	public final void moveUp() {
		super.moveUp();
		this.setSprite(spriteMoveUp);
	}

	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteMoveDown);
	}

	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteMoveRight);
	}

	// public final void fire() {
	// this.spell.add(new Spell(this.z, this.x, this.y, this.sprite, this.road,
	// this.permeability))
	// tempsActuel = System.currentTimeMillis();
	// for(int a = 0; a < 3; a++) {
	// if(tempsActuel - tempsPrecedent >= 1) {
	// this.setSprite(spelled[i]);
	// tempsPrecedent = tempsActuel;
	// if (i >= sprites.length-1) {
	// i = 0;
	// } else {
	// i++;
	// }
	// }
	// }
	// }

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

	@Override
	public final void doNothing() {
		tempsActuel = System.currentTimeMillis();
		super.doNothing();
		for (int a = 0; a < 10; a++) {
			if (tempsActuel - tempsPrecedent >= 1) {
				// this.setSprite(spelled[i]);
				tempsPrecedent = tempsActuel;
				/*
				 * if (i >= spelled.length - 1) { i = 0; } else { i++; }
				 */
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

	@Override
	public void moveUpLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveUpRight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDownLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDownRight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
