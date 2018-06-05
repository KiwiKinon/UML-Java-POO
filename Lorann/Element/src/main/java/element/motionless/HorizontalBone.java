package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The Ditch Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class HorizontalBone extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('-', "horizontal_bone.png");

	/**
	 * Instantiates a new ditch.
	 */
	HorizontalBone() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
