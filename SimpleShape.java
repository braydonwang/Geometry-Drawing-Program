/**
 * [SimpleShape.java]
 * The class is an abstract class that holds the basic information of all simple shapes available to the user.
 * These simple shapes include squares, rectangles, circles and ellipses.
 * All simple shapes have coordinates for reference.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

abstract class SimpleShape extends Shape2D implements Translatable {
  
  /**
   * Creates an object from the SimpleShape class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the shape's reference point
   * @param y          the y coordinate of the shape's reference point
   */
  
  SimpleShape(String type, int x, int y) {
    super(type,x,y);
  }
  
  /**
   * An abstract method that enforces the calculation of the shape's area
   */
  
  abstract void calculateArea();
  
  /**
   * An abstract method that enforces the calculation of the shape's perimeter
   */
  
  abstract void calculatePerimeter();
  
  /**
   * This method translates the coordinate of the shape by a horizontal and vertical shift.
   * @param horizontal the horizontal shift applied to the shape
   * @param vertical      the vertical shift applied to the shape
   */
  
  public void translate(int horizontal, int vertical) {
    this.setX(this.getX() + horizontal);
    this.setY(this.getY() + vertical);
  }
}