package main;

import java.io.IOException;

import controller.ILorannController;
import controller.LorannController;
import model.ILorannModel;
import model.LorannModel;
import view.LorannView;
import view.Sound;

/**
 * <h1>The InsaneVehicles Class.</h1>
 *
 * @author Jade
 * @version 0.2
 */
public abstract class Main {

    /** The Constant startX. */
    private static final int startX = 3;

    /** The Constant startY. */
    private static final int startY = 1;

    private static final int Monster1X = 3;
    
    private static final int Monster1Y = 15;
    
    private static final int Monster2X = 2;
    
    private static final int Monster2Y = 15;
    
    private static final int Monster3X = 4;
    
    private static final int Monster3Y = 15;
    
    private static final int Monster4X = 4;
    
    private static final int Monster4Y = 14;
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws InterruptedException
     *             the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final ILorannModel model = new LorannModel("road.txt", startX, startY, Monster1X, Monster1Y, Monster2X, Monster2Y, Monster3X, Monster3Y, Monster4X, Monster4Y);
        final LorannView view = new LorannView(model.getRoad(), model.getMyVehicle(), model.getMonster1(), model.getMonster2(), model.getMonster3(), model.getMonster4(), model.getSort());
        final ILorannController controller = new LorannController(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());
        Sound sound = new Sound();

        controller.play();
    }
}
