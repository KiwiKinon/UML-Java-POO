package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The Class Ditch.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class GateClosed extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(')', "gate_closed.png");

	/**
	 * Instantiates a new ditch.
	 */
	GateClosed() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
