/**
 * [Ellipse.java]
 * The class represents the ellipse shape, which inherits from the simple shape class.
 * All ellipses have two radii and coordinates for its center.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Ellipse extends SimpleShape {
  
  /** Stores the radius of the ellipse on the major axis. */
  private int radius1;
  /** Stores the radius of the ellipse on the minor axis. */
  private int radius2;
  
  /**
   * Creates an object from the Ellipse class.
   * @param type       the type of the shape
   * @param x            the x coordinate of the ellipse's center
   * @param y            the y coordinate of the ellipse's center
   * @param radius1 the radius of the ellipse on the major axis
   * @param radius2 the radius of the ellipse on the minor axis
   */
  
  Ellipse(String type, int x, int y, int radius1, int radius2) {
    super(type, x, y);
    this.radius1 = radius1;
    this.radius2 = radius2;
    
    //calculating the ellipse's area and perimeter
    calculateArea(); 
    calculatePerimeter();
  }
  
  /**
   * This method returns the radius of the ellipse on the major axis.
   * @return the radius on the major axis
   */
  
  public int getRadius1() {
    return this.radius1;
  }
  
  /**
   * This method returns the radius of the ellipse on the minor axis.
   * @return the radius on the minor axis
   */
  
  public int getRadius2() {
    return this.radius2;
  }
  
  /**
   * This method calculates the area of the ellipse using the two radii.
   */
  
  public void calculateArea() {
    this.setArea(Math.PI * this.radius1 * this.radius2);
  }
  
  /**
   * This method calculates the perimeter of the ellipse using the two radii.
   */
  
  public void calculatePerimeter() {
    this.setPerimeter(Math.PI * (3.0 * (this.radius1 + this.radius2) - Math.sqrt((3.0 * this.radius1 + this.radius2) * (this.radius1 + 3.0 * this.radius2))));
  }
}