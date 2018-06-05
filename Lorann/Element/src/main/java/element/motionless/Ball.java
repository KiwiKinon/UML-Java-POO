package element.motionless;


import element.Permeability;
import element.Sprite;

/**
 * <h1>The Obstacle Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public class Ball extends MotionlessElement {

    /** The Constant SPRITE. */
    public static Sprite SPRITE = new Sprite('o', "crystal_ball.png");
    public static Sprite sol = new Sprite('o', "sol.png");

    /**
     * Instantiates a new obstacle.
     */
    Ball() {
        super(SPRITE, Permeability.PENETRABLE);
    }
    
    
	
}
