package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The Obstacle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Round extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('x', "bone.png");

	/**
	 * Instantiates a new obstacle.
	 */
	Round() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
