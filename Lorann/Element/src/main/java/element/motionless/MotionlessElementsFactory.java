package element.motionless;

import element.motionless.Ball;
import element.motionless.MotionlessElement;
import element.motionless.HorizontalBone;
import element.motionless.VerticalBone;
import element.motionless.GateOpen;
import element.motionless.GateClosed;
import element.motionless.Round;
import element.motionless.Ground;

/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 *
 * @author Jade
 * @version 0.3
 */
public abstract class MotionlessElementsFactory {

    /** The Constant ditchLeft. */
    private static final VerticalBone osvertical = new VerticalBone();

    /** The Constant ditchLeftTurnLeft. */
    private static final HorizontalBone oshorizontal = new HorizontalBone();

    /** The Constant ditchLeftTurnRight. */
    private static final GateClosed porte_fin = new GateClosed();

    /** The Constant MACADAM. */
    public static final Ground sol  = new Ground();
    
    private static final Round rond = new Round();
    
    private static final GateOpen porte_debut = new GateOpen();
    
    private static final Ball boule = new Ball();
    
    
    


    /**
     * The motionless elements is an array of all possible MotionlessElement.
     */
    private static MotionlessElement[]  motionlessElements  = {
        osvertical,
        oshorizontal,
        porte_fin,
        sol,
        rond,
        porte_debut,
        boule,
        };


    
    public static MotionlessElement createBoule() {
        return boule;
    }
    
    public static MotionlessElement createPorte_debut() {
        return porte_debut;
    }
    
    public static MotionlessElement createRond() {
        return rond;
    }
    
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createOsvertical() {
        return osvertical;
    }

    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createOshorizontal() {
        return oshorizontal;
    }

    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createPorte_fin() {
        return porte_fin;
    }



    /**
     * Creates a new macadam object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createSol() {
        return sol;
    }

    

    /**
     * Gets the good MotionlessElement from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file symbol
     */
    public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return sol;
    }
}
