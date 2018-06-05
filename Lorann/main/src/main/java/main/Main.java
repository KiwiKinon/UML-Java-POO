package main;

import java.io.IOException;

import controller.ILorannController;
import controller.LorannController;
import model.ILorannModel;
import model.LorannModel;
import view.LorannView;
import view.Sound;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	private static final int startX = 3;

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
		final ILorannModel model = new LorannModel("map.txt", startX, startY, Monster1X, Monster1Y, Monster2X,
				Monster2Y, Monster3X, Monster3Y, Monster4X, Monster4Y);
		final LorannView view = new LorannView(model.getRoad(), model.getMyVehicle(), model.getMonster1(),
				model.getMonster2(), model.getMonster3(), model.getMonster4());
		final ILorannController controller = new LorannController(view, model);
		view.setOrderPerformer(controller.getOrderPeformer());
		Sound sound = new Sound();

		controller.play();
	}

}
