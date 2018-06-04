package element.mobile;

import java.io.IOException;

import element.Permeability;
import element.Sprite;
import model.IMap;

public class Monster3 extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite image3 = new Sprite('3', "monster_3.png");

	public Monster3(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
		super(MonsterX, MonsterY, image3, road, Permeability.BLOCKING);
		image3.loadImage();
	}

	// @Override
	// public final void moveHG() {
	// super.moveHG();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveHD() {
	// super.moveHD();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveBG() {
	// super.moveBG();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveBD() {
	// super.moveBD();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveLeft() {
	// super.moveLeft();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveUp() {
	// super.moveUp();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveDown() {
	// super.moveDown();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void moveRight() {
	// super.moveRight();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void die() {
	// super.die();
	// this.setSprite(image3);
	// }
	//
	// @Override
	// public final void doNothing() {
	// super.doNothing();
	// this.setSprite(image3);
	// }

	@Override
	public void moveMonster1(int lorannX, int lorannY) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveMonster2(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public final void moveMonster3(final int lorannX, final int lorannY) throws InterruptedException {
		int xmonster3 = this.getPosition().x;
		int ymonster3 = this.getPosition().y;

		if (lorannX - xmonster3 > 0) {
			super.moveRight();
		} else if (lorannX - xmonster3 < 0) {
			super.moveLeft();
		} else {
			super.doNothing();
		}

		if (lorannY - ymonster3 > 0) {
			super.moveDown();
		} else if (lorannY - ymonster3 < 0) {
			super.moveUp();
		} else {
			super.doNothing();
		}

	}

	@Override
	public void moveMonster4(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
