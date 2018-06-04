package element.mobile;

import java.io.IOException;

import element.Permeability;
import element.Sprite;
import model.IMap;

public class Monster2 extends Mobile {

	/** The Constant SPRITE. */
	private static final Sprite image2 = new Sprite('2', "monster_2.png");

	public Monster2(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
		super(MonsterX, MonsterY, image2, road, Permeability.BLOCKING);
		image2.loadImage();
	}

	// @Override
	// public final void moveHG() {
	// super.moveHG();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveHD() {
	// super.moveHD();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveBG() {
	// super.moveBG();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveBD() {
	// super.moveBD();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveLeft() {
	// super.moveLeft();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveUp() {
	// super.moveUp();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveDown() {
	// super.moveDown();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void moveRight() {
	// super.moveRight();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void die() {
	// super.die();
	// this.setSprite(image2);
	// }
	//
	// @Override
	// public final void doNothing() {
	// super.doNothing();
	// this.setSprite(image2);
	// }

	@Override
	public void moveMonster1(int lorannX, int lorannY) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void moveMonster2(final int lorannX, final int lorannY) throws InterruptedException {
		int xmonster2 = this.getPosition().x;
		int ymonster2 = this.getPosition().y;

		if (lorannX - xmonster2 > 0) {
			super.moveRight();
		} else if (lorannX - xmonster2 < 0) {
			super.moveLeft();
		} else {
			super.doNothing();
		}

		if (lorannY - ymonster2 > 0) {
			super.moveDown();
		} else if (lorannY - ymonster2 < 0) {
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
	public void moveMonster4(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
