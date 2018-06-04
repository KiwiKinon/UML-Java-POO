package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The Ditch Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Oshorizontal extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('-', "horizontal_bone.png");

	/**
	 * Instantiates a new ditch.
	 */
	Oshorizontal() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
