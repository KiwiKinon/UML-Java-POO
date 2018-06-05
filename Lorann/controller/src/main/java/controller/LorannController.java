package controller;

import java.io.IOException;

import Order.IOrderPerformer;
import Order.UserOrder;
import model.ILorannModel;
import view.ILorannView;

/**
 * <h1>The Class InsaneVehiclesController.</h1>
 *
 * @author Jade
 * @version 0.1
 * @see IOrderPerformer
 */
public class LorannController implements ILorannController, IOrderPerformer {

	/** The Constant speed. */
	private static final int speed = 100;

	/** The view. */
	private ILorannView view;

	/** The model. */
	private ILorannModel model;

	/** The stack order. */
	private UserOrder stackOrder;

	/**
	 * Instantiates a new insane vehicles controller.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public LorannController(final ILorannView view, final ILorannModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.controller.IIinsaneVehiclesController#play()
	 */
	@Override
	public final void play() throws InterruptedException {
		while (this.getModel().getMyVehicle().isAlive()) {
			Thread.sleep(speed);
			this.getModel().getMonster1().moveMonster1(this.getModel().getMyVehicle().getPosition().x,
					this.getModel().getMyVehicle().getPosition().y);
			this.getModel().getMonster2().moveMonster2(this.getModel().getMyVehicle().getPosition().x,
					this.getModel().getMyVehicle().getPosition().y);
			this.getModel().getMonster3().moveMonster3(this.getModel().getMyVehicle().getPosition().x,
					this.getModel().getMyVehicle().getPosition().y);
			this.getModel().getMonster4().moveMonster4(this.getModel().getMyVehicle().getPosition().x,
					this.getModel().getMyVehicle().getPosition().y);
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getMyVehicle().moveRight();
				break;
			case LEFT:
				this.getModel().getMyVehicle().moveLeft();
				break;
			case DOWN:
				this.getModel().getMyVehicle().moveDown();
				break;
			case UP:
				this.getModel().getMyVehicle().moveUp();
				break;
			case HG:
				this.getModel().getMyVehicle().moveHG();
				break;
			case HD:
				this.getModel().getMyVehicle().moveHD();
				break;
			case BG:
				this.getModel().getMyVehicle().moveBG();
				break;
			case BD:
				this.getModel().getMyVehicle().moveBD();
				break;
			case NOP:
				this.getModel().getMyVehicle().doNothing();
				break;
			}

			if (getModel().getMyVehicle().getPosition().y == getModel().getMonster1().getPosition().y
					&& getModel().getMyVehicle().getPosition().x == getModel().getMonster1().getPosition().x) {
				this.getModel().getMyVehicle().die();
			}
			if (getModel().getMyVehicle().getPosition().y == getModel().getMonster2().getPosition().y
					&& getModel().getMyVehicle().getPosition().x == getModel().getMonster2().getPosition().x) {
				this.getModel().getMyVehicle().die();
			}

			this.clearStackOrder();

			// this.getView().followMyVehicle();
		}
		this.getView().displayMessage("Vous êtes mort");
	}

	/*
	 * (non-Javadoc)
	 * @see fr.exia.insanevehicles.controller.IOrderPerformed#orderPerform(fr.exia.
	 * insanevehicles. controller.UserOrder)
	 */
	/*
	 * (non-Javadoc)
	 * @see
	 * fr.exia.insanevehicles.controller.IIinsaneVehiclesController#orderPerform(fr.
	 * exia. insanevehicles.controller.UserOrder)
	 */
	@Override
	public final void orderPerform(final UserOrder userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	private ILorannView getView() {
		return this.view;
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the view to set
	 */
	private void setView(final ILorannView view) {
		this.view = view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	private ILorannModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the model to set
	 */
	private void setModel(final ILorannModel model) {
		this.model = model;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	private UserOrder getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * fr.exia.insanevehicles.controller.IIinsaneVehiclesController#getOrderPeformer
	 * ()
	 */
	@Override
	public IOrderPerformer getOrderPeformer() {
		return this;
	}

}
