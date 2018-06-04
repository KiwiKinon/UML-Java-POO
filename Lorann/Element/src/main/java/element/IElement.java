package element;

import java.awt.Image;

import showboard.ISquare;

public interface IElement extends ISquare {

	Sprite getSprite();

	Permeability getPermeability();

	@Override
	Image getImage();

}
