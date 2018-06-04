package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The DitchLeft Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Porte_debut extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('(', "gate_open.png");

	/**
	 * Instantiates a new ditchLeft.
	 */
	Porte_debut() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
