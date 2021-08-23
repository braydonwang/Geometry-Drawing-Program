/**
 * [Triangle.java]
 * The class represents the triangle shape, which inherits from the complex shape class.
 * All triangles have a base, height and coordinates to refer to its top left corner.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Triangle extends ComplexShape {
  
  /** Stores the base of the triangle. */
  private int base;
  /** Stores the height of the triangle. */
  private int height;
  
  /**
   * Creates an object from the Triangle class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the triangle's reference point
   * @param y          the y coordinate of the triangle's reference point
   * @param base    the base length of the triangle
   * @param height the height of the triangle
   */
  
  Triangle(String type, int x, int y, int base, int height) {
    super(type, x, y, 3);
    this.base = base;
    this.height = height;
    
    //calculating and setting the x and y coordinates of the triangle using its reference point and dimensions given
    this.setXCoordinates(x,0);
    this.setXCoordinates(x,1);
    this.setXCoordinates(x+base,2);
    this.setYCoordinates(y,0);
    this.setYCoordinates(y,0);
    this.setYCoordinates(y+height,1);
    this.setYCoordinates(y+height,2);
    
    //calculating the triangle's area and perimeter
    calculateArea(); 
    calculatePerimeter();
  }
  
  /**
   * This method calculates the area of the triangle using the base and height.
   */
  
  public void calculateArea() {
    this.setArea((this.base*this.height)/2.0);
  }
  
  /**
   * This method calculates the perimeter of the triangle using the base and height.
   */
  
  public void calculatePerimeter() {
    double hypotenuse = Math.sqrt(this.base*this.base+this.height*this.height);
    this.setPerimeter(this.base+this.height+hypotenuse);
  }
  
  /**
   * This method returns the base length of the triangle.
   * @return the base of the triangle
   */
  
  public int getBase() {
    return this.base;
  }
  
  /**
   * This method returns the height of the triangle.
   * @return the height of the triangle
   */
  
  public int getHeight() {
    return this.height;
  }
}