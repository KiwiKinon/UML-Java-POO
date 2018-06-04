package element.mobile;

import java.io.IOException;

import element.Permeability;
import element.Sprite;
import model.IRoad;

public class Monster4 extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite image4 = new Sprite('4', "monster_4.png");

	public Monster4(final int MonsterX, final int MonsterY, final IRoad road) throws IOException {
		super(MonsterX, MonsterY, image4, road, Permeability.BLOCKING);
		image4.loadImage();
	}

	// @Override
	// public final void moveHG() {
	// super.moveHG();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveHD() {
	// super.moveHD();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveBG() {
	// super.moveBG();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveBD() {
	// super.moveBD();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveLeft() {
	// super.moveLeft();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveUp() {
	// super.moveUp();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveDown() {
	// super.moveDown();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void moveRight() {
	// super.moveRight();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void die() {
	// super.die();
	// this.setSprite(image4);
	// }
	//
	// @Override
	// public final void doNothing() {
	// super.doNothing();
	// this.setSprite(image4);
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
	public final void moveMonster4(final int lorannX, final int lorannY) throws InterruptedException {
		int xmonster4 = this.getPosition().x;
		int ymonster4 = this.getPosition().y;

		if (lorannX - xmonster4 > 0) {
			super.moveRight();
		} else if (lorannX - xmonster4 < 0) {
			super.moveLeft();
		} else {
			super.doNothing();
		}

		if (lorannY - ymonster4 > 0) {
			super.moveDown();
		} else if (lorannY - ymonster4 < 0) {
			super.moveUp();
		} else {
			super.doNothing();
		}

	}

	@Override
	public void moveMonster3(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
