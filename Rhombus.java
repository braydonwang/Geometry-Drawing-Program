/**
 * [Rhombus.java]
 * The class represents the rhombus shape, which inherits directly from the parallelogram class.
 * All rhombuses have a base, height and coordinates for reference. 
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Rhombus extends Parallelogram {
  
  /**
   * Creates an object from the Rhombus class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the rhombus' reference point
   * @param y          the y coordinate of the rhonbus' reference point
   * @param base    the base length of the rhombus
   * @param height the height of the rhombus
   */
  
  Rhombus(String type, int x, int y, int base, int height) {
    super(type,x,y,base,height,base);
  }
}