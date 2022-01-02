/**
 * [Rectangle.java]
 * The class represents the rectangle shape, which inherits from the simple shape class.
 * All rectangles have a length, width and coordinates to reference its top left corner. 
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Rectangle extends SimpleShape {
  
  /** Stores the length of the rectangle. */
  private int length;
  /** Stores the width of the rectangle. */
  private int width;
  
  /**
   * Creates an object from the Rectangle class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the rectangle's reference point
   * @param y          the y coordinate of the rectangle's reference point
   * @param length the length of the rectangle
   * @param width   the width of the rectangle
   */
  
  Rectangle(String type, int x, int y, int length, int width) {
    super(type, x, y);
    this.length = length;
    this.width = width;
    
    //calculating the rectangle's area and perimeter
    calculateArea(); 
    calculatePerimeter();
  }
  
  /**
   * This method returns the length of the rectangle.
   * @return the length of the rectangle
   */
  
  public int getLength() {
    return this.length;
  }
  
  /**
   * This method returns the width of the rectangle.
   * @return the width of the rectangle
   */
  
  public int getWidth() {
    return this.width;
  }
  
  /**
   * This method calculates the area of the rectangle using the length and width.
   */
  
  public void calculateArea() {
    this.setArea(this.length * this.width);
  }
  
  /**
   * This method calculates the perimeter of the rectangle using the length and width.
   */
  
  public void calculatePerimeter() {
    this.setPerimeter(2 * (this.length + this.width));
  }
}