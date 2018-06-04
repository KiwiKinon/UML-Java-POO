package controller;

import Order.IOrderPerformer;

public interface ILorannController {

	void play() throws InterruptedException;

	IOrderPerformer getOrderPeformer();
}
