package model;

import element.mobile.IMobile;
import model.IMap;

/**
 * <h1>The Interface IInsaneVehiclesModel.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public interface ILorannModel {

    /**
     * Gets the road.
     *
     * @return the road
     */
    IMap getRoad();

    /**
     * Gets the my vehicle.
     *
     * @return the myVehicle
     */
    IMobile getMyLorann();

	IMobile getMonster1();

	IMobile getMonster2();

	IMobile getMonster3();
    
	IMobile getMonster4();

	IMobile getSpell();

}
