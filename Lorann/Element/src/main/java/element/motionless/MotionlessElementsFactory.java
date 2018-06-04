package element.motionless;

/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 *
 * @author Jade
 * @version 0.3
 */
public abstract class MotionlessElementsFactory {

	/** The Constant ditchLeft. */
	private static final Osvertical osvertical = new Osvertical();

	/** The Constant ditchLeftTurnLeft. */
	private static final Oshorizontal oshorizontal = new Oshorizontal();

	/** The Constant ditchLeftTurnRight. */
	private static final Porte_fin porte_fin = new Porte_fin();

	/** The Constant MACADAM. */
	private static final Sol sol = new Sol();

	private static final Rond rond = new Rond();

	private static final Porte_debut porte_debut = new Porte_debut();

	/**
	 * The motionless elements is an array of all possible MotionlessElement.
	 */
	private static MotionlessElement[] motionlessElements = { osvertical, oshorizontal, porte_fin, sol, rond,
			porte_debut, };

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
