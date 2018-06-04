package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Osvertical extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('|', "vertical_bone.png");

	/**
	 * Instantiates a new ditchLeft.
	 */
	Osvertical() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
