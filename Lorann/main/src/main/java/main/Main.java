package main;

import java.io.IOException;

import controller.IIinsaneVehiclesController;
import controller.InsaneVehiclesController;
import model.IInsaneVehiclesModel;
import model.InsaneVehiclesModel;
import view.InsaneVehiclesView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/** The Constant startX. */
	private static final int startX = 3;

	/** The Constant startY. */
	private static final int startY = 1;

	private static final int Monster1X = 3;

	private static final int Monster1Y = 12;

	private static final int Monster2X = 3;

	private static final int Monster2Y = 13;

	private static final int Monster3X = 3;

	private static final int Monster3Y = 14;

	private static final int Monster4X = 3;

	private static final int Monster4Y = 15;

	public static void main(final String[] args) throws IOException, InterruptedException {
		final IInsaneVehiclesModel model = new InsaneVehiclesModel("road.txt", startX, startY, Monster1X, Monster1Y,
				Monster2X, Monster2Y, Monster3X, Monster3Y, Monster4X, Monster4Y);
		final InsaneVehiclesView view = new InsaneVehiclesView(model.getRoad(), model.getMyVehicle(),
				model.getMonster1(), model.getMonster2(), model.getMonster3(), model.getMonster4());
		final IIinsaneVehiclesController controller = new InsaneVehiclesController(view, model);
		view.setOrderPerformer(controller.getOrderPeformer());

		controller.play();
	}
}
