package element.mobile;


import java.io.IOException;

import model.IMap;
import element.Permeability;
import element.Sprite;

public class Monster3 extends Mobile {


    private long tempsActuel;
    private static long tempsPrecedent = System.currentTimeMillis();
    /** The Constant SPRITE. */
    private static final Sprite image3          = new Sprite('3', "monster_3.png");
    
    public Monster3(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
        super(MonsterX, MonsterY, image3, road, Permeability.BLOCKING);
        image3.loadImage();
    }
    
    @Override
    public final void moveHG() {
        super.moveHG();
        this.setSprite(image3);
    }
    
    @Override
    public final void moveHD() {
        super.moveHD();
        this.setSprite(image3);
    }
    
    @Override
    public final void moveBG() {
        super.moveBG();
        this.setSprite(image3);
    }
    
    @Override
    public final void moveBD() {
        super.moveBD();
        this.setSprite(image3);
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(image3);
    }
    
    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(image3);
    }
    
    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(image3);
    }

    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(image3);
    }


    @Override
    public final void die() {
        super.die();
        this.setSprite(image3);
    }
    
    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(image3);
    }

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
		tempsActuel = System.currentTimeMillis();
	    for(int a = 0; a < 10; a++) {
	    	if(tempsActuel - tempsPrecedent >= 300) {
	    		int xmonster2 = this.getPosition().x;
	            int ymonster2 = this.getPosition().y;

	            if(lorannX-xmonster2>0 && lorannY-ymonster2>0) {
	            	this.moveBD();
	            }else if(lorannX-xmonster2<0 && lorannY-ymonster2>0){
	            	this.moveBG();
	            }else if(lorannX-xmonster2>0 && lorannY-ymonster2<0){
	            	this.moveHD();
	            }else if(lorannX-xmonster2<0 && lorannY-ymonster2<0){
	            	this.moveHG();
	            }else if(lorannX-xmonster2>0 && lorannY-ymonster2==0){
	            	this.moveBD();
	            }else if(lorannX-xmonster2<0 && lorannY-ymonster2==0){
	            	this.moveHG();
	            }else if(lorannX-xmonster2==0 && lorannY-ymonster2<0){
	            	this.moveHD();
	            }else if(lorannX-xmonster2==0 && lorannY-ymonster2>0){
	            	this.moveBG();
	            }else {
	            	this.doNothing();
	            }
	        	
	        	tempsPrecedent = tempsActuel;
	    	}
	    }
    }

	@Override
	public void moveMonster4(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}





    
}
