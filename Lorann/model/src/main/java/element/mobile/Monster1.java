package element.mobile;

import java.io.IOException;

import model.IMap;
import element.Permeability;
import element.Sprite;

public class Monster1 extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite image1          = new Sprite('1', "monster_1.png");
    
 
    public Monster1(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
        super(MonsterX, MonsterY, image1, road, Permeability.BLOCKING);
        image1.loadImage();
    }
    
    @Override
    public final void moveHG() {
        super.moveHG();
        this.setSprite(image1);
    }
    
    @Override
    public final void moveHD() {
        super.moveHD();
        this.setSprite(image1);
    }
    
    @Override
    public final void moveBG() {
        super.moveBG();
        this.setSprite(image1);
    }
    
    @Override
    public final void moveBD() {
        super.moveBD();
        this.setSprite(image1);
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(image1);
    }
    
    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(image1);
    }
    
    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(image1);
    }

   /* @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(image1);
    }*/

    @Override
    public final void die() {
        super.die();
        this.setSprite(image1);
    }
    
    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(image1);
    }

    @Override
    public final void moveMonster1(final int lorannX, final int lorannY) throws InterruptedException {
    	int xmonster1 = this.getPosition().x;
        int ymonster1 = this.getPosition().y;

        if(lorannX-xmonster1>0) {
        	super.moveRight();
        }else if(lorannX-xmonster1<0){
        	super.moveLeft();
        }else {
        	super.doNothing();
        }
        
        if(lorannY-ymonster1>0) {
        	super.moveDown();
        }else if(lorannY-ymonster1<0){
        	 super.moveUp();
        }else {
        	super.doNothing();
        }
        
    	
    }

	@Override
	public void moveMonster2(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveMonster3(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveMonster4(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	





    
}
