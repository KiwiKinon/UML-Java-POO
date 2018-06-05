package element.mobile;

import java.io.IOException;

import model.IMap;
import element.Permeability;
import element.Sprite;

public class Monster4 extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite image4          = new Sprite('4', "monster_4.png");

    private long tempsActuel;
    private static long tempsPrecedent = System.currentTimeMillis();
 
    public Monster4(final int MonsterX, final int MonsterY, final IMap road) throws IOException {
        super(MonsterX, MonsterY, image4, road, Permeability.BLOCKING);
        image4.loadImage();
    }
    
    @Override
    public final void moveHG() {
        super.moveHG();
        this.setSprite(image4);
    }
    
    @Override
    public final void moveHD() {
        super.moveHD();
        this.setSprite(image4);
    }
    
    @Override
    public final void moveBG() {
        super.moveBG();
        this.setSprite(image4);
    }
    
    @Override
    public final void moveBD() {
        super.moveBD();
        this.setSprite(image4);
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(image4);
    }
    
    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(image4);
    }
    
    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(image4);
    }

    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(image4);
    }

    @Override
    public final void die() {
        super.die();
        this.setSprite(image4);
    }

    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(image4);
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
    public final void moveMonster4(final int lorannX, final int lorannY) throws InterruptedException {
	    		int xmonster2 = this.getPosition().x;
	            int ymonster2 = this.getPosition().y;
	            if(lorannX-xmonster2>0) {
	            	if(!this.isCrashed(this.getPosition().x+1, this.getPosition().y)) {
	            		tempsActuel = System.currentTimeMillis();
		    	    	if(tempsActuel - tempsPrecedent >= 300) {
		    	    		tempsPrecedent = tempsActuel;
		    	    		this.moveRight();
		    	    	}
	            	}
	            }else if(lorannX-xmonster2<0){
	            	if(!this.isCrashed(this.getPosition().x-1, this.getPosition().y)) {
		        		tempsActuel = System.currentTimeMillis();
		    	    	if(tempsActuel - tempsPrecedent >= 300) {
		    	    		tempsPrecedent = tempsActuel;
		    	    		this.moveLeft();
		    	    	}
	    	    	}
	            }else {
	            	this.doNothing();
	            }
	            
	            if(lorannY-ymonster2>0) {
	            	if(!this.isCrashed(this.getPosition().x, this.getPosition().y+1)) {
		        		tempsActuel = System.currentTimeMillis();
		    	    	if(tempsActuel - tempsPrecedent >= 300) {
		    	    		tempsPrecedent = tempsActuel;
		    	    		this.moveDown();	            		
		    	    	}
	    	    	}
	            }else if(lorannY-ymonster2<0){
	        		if(!this.isCrashed(this.getPosition().x, this.getPosition().y-1)) {
		            	tempsActuel = System.currentTimeMillis();
		    	    	if(tempsActuel - tempsPrecedent >= 300) {
		    	    		tempsPrecedent = tempsActuel;
		    	    		this.moveUp();	
		    	    	}
	    	    	}
	            }else {
	            	this.doNothing();
	            }
	        	
	        	
	    }

	@Override
	public void moveMonster3(int lorannX, int lorannY) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void moveSort() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void State(int lorannX, int lorannY, Boolean state) {
		// TODO Auto-generated method stub
		
	}



    
}
