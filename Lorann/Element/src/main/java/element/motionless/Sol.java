package element.motionless;

import element.Permeability;
import element.Sprite;

/**
 * <h1>The Macadam Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
class Sol extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(' ', "sol.png");

	/**
	 * Instantiates a new macadam.
	 */
	Sol() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
