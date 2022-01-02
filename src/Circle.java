/**
 * [Circle.java]
 * The class represents the circle shape, which inherits from the ellipse class.
 * All circles have a radius and coordinates for its center.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Circle extends Ellipse {
  
  /**
   * Creates an object from the Circle class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the circle's center
   * @param y          the y coordinate of the circle's center
   * @param radius the radius of the circle
   */
  
  Circle(String type, int x, int y, int radius) {
    super(type, x, y, radius, radius);
  }
}