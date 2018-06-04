/*
 * package element.mobile;
 * 
 * import java.io.IOException;
 * 
 * import element.Permeability; import element.Sprite; import model.IRoad;
 * 
 * public class Spell extends Mobile {
 * 
 * private static final Sprite spell1 = new Sprite('�', "fireball_1.png");
 * 
 * private static final Sprite spell2 = new Sprite('�', "fireball_2.png");
 * 
 * private static final Sprite spell3 = new Sprite('�', "fireball_3.png");
 * 
 * private static final Sprite spell4 = new Sprite('�', "fireball_4.png");
 * 
 * public Spell(final int z, final int x, final int y, final Sprite sprite,
 * final IRoad road, final Permeability permeability) throws IOException {
 * super(z, x, y, sprite, road, permeability); spell1.loadImage();
 * spell2.loadImage(); spell3.loadImage(); spell4.loadImage();
 * 
 * }
 * 
 * private static int i = 0;
 * 
 * private long tempsActuel;
 * 
 * private static long tempsPrecedent = System.currentTimeMillis();
 * 
 * private static final Sprite[] spelled = { spell1, spell2, spell3, spell4, };
 * 
 * public void moveSpell() { if (this.z == 1) { super.moveUp(); } if (this.z ==
 * 2) { super.moveDown(); } if (this.z == 3) { super.moveLeft(); } if (this.z ==
 * 4) { super.moveRight(); } if (this.z == 5) { super.moveUpLeft(); } if (this.z
 * == 6) { super.moveUpRight(); } if (this.z == 7) { super.moveDownLeft(); } if
 * (this.z == 8) { super.moveDownRight(); } }
 * 
 * @Override public void moveMonster1(int lorannX, int lorannY) throws
 * InterruptedException { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void moveMonster2(int lorannX, int lorannY) throws
 * InterruptedException { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void moveMonster3(int lorannX, int lorannY) throws
 * InterruptedException { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void moveMonster4(int lorannX, int lorannY) throws
 * InterruptedException { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public final void moveUpLeft() { super.moveUpLeft(); tempsActuel =
 * System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } } }
 * 
 * @Override public final void moveUpRight() { super.moveUpRight(); tempsActuel
 * = System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } } }
 * 
 * @Override public final void moveDownLeft() { super.moveDownLeft();
 * tempsActuel = System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if
 * (tempsActuel - tempsPrecedent >= 1) { this.setSprite(spelled[i]);
 * tempsPrecedent = tempsActuel; if (i >= spelled.length - 1) { i = 0; } else {
 * i++; } } } }
 * 
 * @Override public final void moveDownRight() { super.moveDownRight();
 * tempsActuel = System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if
 * (tempsActuel - tempsPrecedent >= 1) { this.setSprite(spelled[i]);
 * tempsPrecedent = tempsActuel; if (i >= spelled.length - 1) { i = 0; } else {
 * i++; } } } }
 * 
 * @Override public final void moveLeft() { super.moveLeft(); tempsActuel =
 * System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } } }
 * 
 * @Override public final void moveUp() { super.moveUp(); tempsActuel =
 * System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } } }
 * 
 * @Override public final void moveDown() { super.moveDown(); tempsActuel =
 * System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } } }
 * 
 * @Override public void fire() { // super.fire(); tempsActuel =
 * System.currentTimeMillis(); for (int a = 0; a < 3; a++) { if (tempsActuel -
 * tempsPrecedent >= 1) { this.setSprite(spelled[i]); tempsPrecedent =
 * tempsActuel; if (i >= spelled.length - 1) { i = 0; } else { i++; } } }
 * 
 * }
 * 
 * }
 */
