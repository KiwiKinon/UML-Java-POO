package model;

import java.io.IOException;

import element.mobile.IMobile;
import element.mobile.Monster1;
import element.mobile.Monster2;
import element.mobile.Monster3;
import element.mobile.Monster4;
import element.mobile.MyLorann;

/**
 * <h1>The Class InsaneVehiclesModel.</h1>
 */
public class LorannModel implements ILorannModel {

	/** The road. */
	private IMap road;

	/** The my vehicle. */
	private IMobile myVehicle;

	private IMobile monster1;

	private IMobile monster2;

	private IMobile monster3;

	private IMobile monster4;

	/**
	 * Instantiates a new insane vehicles model.
	 *
	 * @param fileName
	 *            the file name
	 * @param myVehicleStartX
	 *            the my vehicle start X
	 * @param myVehicleStartY
	 *            the my vehicle start Y
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws InterruptedException
	 */
	public LorannModel(final String fileName, final int myVehicleStartX, final int myVehicleStartY,
			final int Monster1startX, final int Monster1startY, final int Monster2startX, final int Monster2startY,
			final int Monster3startX, final int Monster3startY, final int Monster4startX, final int Monster4startY)
			throws IOException, InterruptedException {
		this.setRoad(new Map(fileName));
		this.setMyVehicle(new MyLorann(myVehicleStartX, myVehicleStartY, this.getRoad()));
		this.setMonster1(new Monster1(Monster1startX, Monster1startY, this.getRoad()));
		this.setMonster2(new Monster2(Monster2startX, Monster2startY, this.getRoad()));
		this.setMonster3(new Monster3(Monster3startX, Monster3startY, this.getRoad()));
		this.setMonster4(new Monster4(Monster4startX, Monster4startY, this.getRoad()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getRoad()
	 */
	@Override
	public final IMap getRoad() {
		return this.road;
	}

	/**
	 * Sets the road.
	 *
	 * @param road
	 *            the road to set
	 */
	private void setRoad(final IMap road) {
		this.road = road;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getMyVehicle()
	 */
	@Override
	public final IMobile getMyVehicle() {
		return this.myVehicle;
	}

	/**
	 * Sets the my vehicle.
	 *
	 * @param myVehicle
	 *            the myVehicle to set
	 */
	private void setMyVehicle(final IMobile myVehicle) {
		this.myVehicle = myVehicle;
	}

	@Override
	public IMobile getMonster1() {
		return this.monster1;
	}

	private void setMonster1(final IMobile monster1) {
		this.monster1 = monster1;
	}

	@Override
	public IMobile getMonster2() {
		return this.monster2;
	}

	private void setMonster2(final IMobile monster2) {
		this.monster2 = monster2;
	}

	@Override
	public IMobile getMonster3() {
		return this.monster3;
	}

	private void setMonster3(final IMobile monster3) {
		this.monster3 = monster3;
	}

	@Override
	public IMobile getMonster4() {
		return this.monster4;
	}

	private void setMonster4(final IMobile monster4) {
		this.monster4 = monster4;
	}

}
