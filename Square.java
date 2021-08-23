/**
 * [Square.java]
 * The class represents the square shape, which inherits from the rectangle class.
 * All squares have a side length and coordinates to refer to its top left corner. 
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Square extends Rectangle{
  
  /**
   * Creates an object from the Square class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the square's reference point
   * @param y          the y coordinate of the square's reference point
   * @param length the side length of the square
   */
  
  Square(String type, int x, int y, int length) {
    super(type,x,y,length,length);
  }
}