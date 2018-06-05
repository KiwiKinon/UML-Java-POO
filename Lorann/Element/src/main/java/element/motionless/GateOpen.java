package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class GateOpen extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('(', "gate_open.png");

	/**
	 * Instantiates a new ditchLeft.
	 */
	GateOpen() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
