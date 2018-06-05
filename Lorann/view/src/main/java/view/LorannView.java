package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Order.IOrderPerformer;
import Order.UserOrder;
import element.mobile.IMobile;
import model.IMap;
import showboard.BoardFrame;

/**
 * <h1>The InsaneVehiclesView Class.</h1>
 *
 * @author Jade
 * @version 0.4
 */
public class LorannView implements Runnable, KeyListener, ILorannView {

	/** The Constant roadView. */
	private static final int roadView = 21;

	/** The Constant squareSize. */
	private static final int squareSize = 30;

	/** The Constant closeView. */
	private Rectangle closeView;

	/** The road. */
	private IMap road;

	/** My vehicle. */
	private IMobile myVehicle;

	private IMobile monster1;

	private IMobile monster2;

	private IMobile monster3;

	private IMobile monster4;

	/** The view. */
	private int view;

	/** The order performer. */
	private IOrderPerformer orderPerformer;

	private IMobile spell;

	public static int BX;

	private static int BY;

	/**
	 * Instantiates a new insane vehicles View.
	 *
	 * @param road
	 *            the road
	 * @param myVehicle
	 *            the my vehicle
	 * @param monster2
	 *            the monster2
	 * @param monster4
	 *            the monster 4
	 * @param monster3
	 *            the monster 3
	 * @param monster1
	 *            the monster 1
	 * @param spell
	 *            the spell
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public LorannView(final IMap road, final IMobile myVehicle, final IMobile monster1, final IMobile monster2,
			final IMobile monster3, final IMobile monster4, final IMobile spell) throws IOException {
		this.setView(roadView);
		this.setRoad(road);
		this.setMyVehicle(myVehicle);
		this.getMyVehicle().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMyVehicle().getY(), this.getRoad().getWidth(), roadView));
		this.setSpell(spell);
		this.getSpell().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getSpell().getY(), this.getRoad().getWidth(), roadView));
		this.setMonster1(monster1);
		this.getMonster1().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMonster1().getY(), this.getRoad().getWidth(), roadView));
		this.setMonster2(monster2);
		this.getMonster2().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMonster2().getY(), this.getRoad().getWidth(), roadView));
		this.setMonster3(monster3);
		this.getMonster3().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMonster3().getY(), this.getRoad().getWidth(), roadView));
		this.setMonster4(monster4);
		this.getMonster4().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMonster4().getY(), this.getRoad().getWidth(), roadView));

		SwingUtilities.invokeLater(this);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * fr.exia.insanevehicles.view.IInsaneVehiclesView#displayMessage(java.lang.
	 * String)
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public final void run() {
		final BoardFrame boardFrame = new BoardFrame("Lorann");
		boardFrame.setDimension(new Dimension(this.getRoad().getWidth(), this.getRoad().getHeight()));
		boardFrame.setDisplayFrame(this.closeView);
		boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
		// boardFrame.setHeightLooped(true);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < this.getRoad().getWidth(); x++) {
			for (int y = 0; y < this.getRoad().getHeight(); y++) {
				boardFrame.addSquare(this.road.getOnTheRoadXY(x, y), x, y);
			}
		}
		boardFrame.addPawn(this.getSpell());
		boardFrame.addPawn(this.getMyVehicle());
		boardFrame.addPawn(this.getMonster1());
		boardFrame.addPawn(this.getMonster2());
		boardFrame.addPawn(this.getMonster3());
		boardFrame.addPawn(this.getMonster4());

		this.getRoad().getObservable().addObserver(boardFrame.getObserver());
		this.followMyVehicle();

		boardFrame.setVisible(true);

	}

	/**
	 * Prints the road and the player's vehicle in the console.
	 *
	 * @param yStart
	 *            the y start
	 */
	public final void show(final int yStart) {
		int y = yStart % this.getRoad().getHeight();
		for (int view = 0; view < this.getView(); view++) {
			for (int x = 0; x < this.getRoad().getWidth(); x++) {
				if ((x == this.getMyVehicle().getX()) && (y == yStart)) {
					System.out.print(this.getMyVehicle().getSprite().getConsoleImage());

				}

				System.out.print(this.getRoad().getOnTheRoadXY(x, y).getSprite().getConsoleImage());

			}
		}
		y = (y + 1) % this.getRoad().getHeight();
		System.out.print("\n");
	}
	// }

	/**
	 * Key code to user order.
	 *
	 * @param keyCode
	 *            the key code
	 * @return the user order
	 */
	private static UserOrder keyCodeToUserOrder(final int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_NUMPAD6:
			userOrder = UserOrder.RIGHT;
			break;
		case KeyEvent.VK_NUMPAD4:
			userOrder = UserOrder.LEFT;
			break;
		case KeyEvent.VK_NUMPAD5:
			userOrder = UserOrder.DOWN;
			break;
		case KeyEvent.VK_NUMPAD8:
			userOrder = UserOrder.UP;
			break;
		case KeyEvent.VK_NUMPAD7:
			userOrder = UserOrder.HG;
			break;
		case KeyEvent.VK_NUMPAD9:
			userOrder = UserOrder.HD;
			break;
		case KeyEvent.VK_NUMPAD1:
			userOrder = UserOrder.BG;
			break;
		case KeyEvent.VK_NUMPAD3:
			userOrder = UserOrder.BD;
			break;
		case KeyEvent.VK_ENTER:
			userOrder = UserOrder.ENTER;
			break;
		default:
			userOrder = UserOrder.NOP;
			break;
		}
		return userOrder;
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent keyEvent) {
		// Nop
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public final void keyPressed(final KeyEvent keyEvent) {
		try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
		} catch (final IOException exception) {
			exception.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent keyEvent) {
		// Nop
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.view.IInsaneVehiclesView#followMyvehicle()
	 */
	@Override
	public final void followMyVehicle() {
		this.getCloseView().y = this.getMyVehicle().getY() - 1;
	}

	public static int getBX() {
		return BX;
	}

	public static int getBY() {
		return BY;
	}

	/**
	 * Gets the road.
	 *
	 * @return the road
	 */
	private IMap getRoad() {
		return this.road;
	}

	/**
	 * Sets the road.
	 *
	 * @param road
	 *            the new road
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void setRoad(final IMap road) throws IOException {
		this.road = road;
		for (int x = 0; x < this.getRoad().getWidth(); x++) {
			for (int y = 0; y < this.getRoad().getHeight(); y++) {
				this.getRoad().getOnTheRoadXY(x, y).getSprite().loadImage();
			}
		}
	}

	/**
	 * Gets my vehicle.
	 *
	 * @return my vehicle
	 */
	private IMobile getMyVehicle() {
		return this.myVehicle;
	}

	/**
	 * Sets my vehicle.
	 *
	 * @param myVehicle
	 *            my new vehicle
	 */
	private void setMyVehicle(final IMobile myVehicle) {
		this.myVehicle = myVehicle;
	}

	private IMobile getMonster1() {
		return this.monster1;
	}

	private void setSpell(final IMobile spell) {
		this.spell = spell;
	}

	private IMobile getSpell() {
		return this.spell;
	}

	private void setMonster1(final IMobile monster1) {
		this.monster1 = monster1;
	}

	private IMobile getMonster2() {
		return this.monster2;
	}

	private void setMonster2(final IMobile monster2) {
		this.monster2 = monster2;
	}

	private IMobile getMonster3() {
		return this.monster3;
	}

	private void setMonster3(final IMobile monster3) {
		this.monster3 = monster3;
	}

	private IMobile getMonster4() {
		return this.monster4;
	}

	private void setMonster4(final IMobile monster4) {
		this.monster4 = monster4;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	private int getView() {
		return this.view;
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	private void setView(final int view) {
		this.view = view;
	}

	/**
	 * Gets the close view.
	 *
	 * @return the close view
	 */
	private Rectangle getCloseView() {
		return this.closeView;
	}

	/**
	 * Sets the close view.
	 *
	 * @param closeView
	 *            the new close view
	 */
	private void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

	/**
	 * Gets the order performer.
	 *
	 * @return the order performer
	 */
	private IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
	 * Sets the order performer.
	 *
	 * @param orderPerformer
	 *            the new order performer
	 */
	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
}
