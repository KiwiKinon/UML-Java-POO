package element.mobile;

import java.io.IOException;

import model.IMap;
import element.Permeability;
import element.Sprite;

public class Monster2 extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite image2          = new Sprite('2', "monster_2.png");

    private long tempsActuel;
    private static long tempsPrecedent = System.currentTimeMillis();
 
    public Monster2(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
        super(MonsterX, MonsterY, image2, road, Permeability.BLOCKING);
        image2.loadImage();
    }
    
    @Override
    public final void moveHG() {
        super.moveHG();
        this.setSprite(image2);
    }
    
    @Override
    public final void moveHD() {
        super.moveHD();
        this.setSprite(image2);
    }
    
    @Override
    public final void moveBG() {
        super.moveBG();
        this.setSprite(image2);
    }
    
    @Override
    public final void moveBD() {
        super.moveBD();
        this.setSprite(image2);
    }

    @Override
    public final void moveLeft() {
    	if(this.isCrashed(this.getPosition().x-1, this.getPosition().y)) {
        	this.moveUp();
        	tempsActuel = System.currentTimeMillis();
	    	if(tempsActuel - tempsPrecedent >= 300) {
	    		tempsPrecedent = tempsActuel;
	    		this.moveLeft();
	    	}
        }else {
        	super.moveLeft();
        }
        this.setSprite(image2);
    }
    
    @Override
    public final void moveUp() {
        if(this.isCrashed(this.getPosition().x, this.getPosition().y-1)) {
        	this.moveRight();
        	tempsActuel = System.currentTimeMillis();
    	    	if(tempsActuel - tempsPrecedent >= 300) {
    	    		tempsPrecedent = tempsActuel;
    	    		this.moveUp();
    	    	}
        }else {
        	super.moveUp();
        }
        this.setSprite(image2);
    }
    
    @Override
    public final void moveDown() {
        if(this.isCrashed(this.getPosition().x, this.getPosition().y+1)) {
        	this.moveLeft();
        	tempsActuel = System.currentTimeMillis();
	    	if(tempsActuel - tempsPrecedent >= 300) {
	    		tempsPrecedent = tempsActuel;
	    		this.moveDown();
	    	}
        }else {
        	super.moveDown();
        }
        this.setSprite(image2);
    }

    @Override
    public final void moveRight() {
        if(this.isCrashed(this.getPosition().x+1, this.getPosition().y)) {
        	this.moveDown();
        	tempsActuel = System.currentTimeMillis();
	    	if(tempsActuel - tempsPrecedent >= 300) {
	    		tempsPrecedent = tempsActuel;
	    		this.moveRight();
	    	}
        }else {
        	super.moveRight();
        }
        this.setSprite(image2);
    }

    @Override
    public final void die() {
        super.die();
        this.setSprite(image2);
    }
    
    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(image2);
    }

	@Override
	public void moveMonster1(int lorannX, int lorannY) {
		// TODO Auto-generated method stub
		
	}


	@Override
    public final void moveMonster2(final int lorannX, final int lorannY) throws InterruptedException {
		tempsActuel = System.currentTimeMillis();
	    for(int a = 0; a < 10; a++) {
	    	if(tempsActuel - tempsPrecedent >= 300) {
	    		int xmonster2 = this.getPosition().x;
	            int ymonster2 = this.getPosition().y;

	            if(lorannX-xmonster2>0) {
	            	this.moveRight();
	            }else if(lorannX-xmonster2<0){
	            	this.moveLeft();
	            }else {
	            	this.doNothing();
	            }
	            
	            if(lorannY-ymonster2>0) {
	            	this.moveDown();
	            }else if(lorannY-ymonster2<0){
	            	this.moveUp();
	            }else {
	            	this.doNothing();
	            }
	        	
	        	tempsPrecedent = tempsActuel;
	    	}
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

}





    
