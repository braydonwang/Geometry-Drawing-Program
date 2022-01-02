/**
 * [Trapezoid.java]
 * The class represents the trapezoid shape, which inherits from the complex shape class.
 * All trapezoids have two bases, a height and coordinates for reference.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Trapezoid extends ComplexShape {
  
  /** Stores the top base of the trapezoid. */
  private int base1;
  /** Stores the bottom base of the trapezoid. */
  private int base2;
  /** Stores the height of the trapezoid. */
  private int height;
  
  /**
   * Creates an object from the Trapezoid class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the trapezoid's reference point
   * @param y          the y coordinate of the trapezoid's reference point
   * @param base1  the top base length of the trapezoid
   * @param base2  the bottom base length of the trapezoid
   * @param height the height of the trapezoid
   */
  
  Trapezoid(String type, int x, int y, int base1, int base2, int height) {
    super(type,x,y,4);
    this.base1 = base1;
    this.base2 = base2;
    this.height = height;
    
    //calculating and setting the x and y coordinates of the trapezoid using its reference point and dimensions given
    this.setXCoordinates(x+((base2-base1)/2),0);
    this.setXCoordinates(x+((base2-base1)/2)+base1,1);
    this.setXCoordinates(x+base2,2);
    this.setXCoordinates(x,3);
    this.setYCoordinates(y,0);
    this.setYCoordinates(y,1);
    this.setYCoordinates(y+height,2);
    this.setYCoordinates(y+height,3);
    
    //calculating the trapezoid's area and perimeter
    calculateArea(); 
    calculatePerimeter();
  }
  
  /**
   * This method calculates the area of the trapezoid using the two bases and the height.
   */
  
  public void calculateArea() {
    this.setArea((this.base1+this.base2)/2.0*this.height);
  }
  
  /**
   * This method calculates the perimeter of the trapezoid using the two bases and the height.
   */
  
  public void calculatePerimeter() {
    double side = Math.sqrt((this.base2 - this.base1)*(this.base2 - this.base1) + this.height*this.height);
    this.setPerimeter(side+side+this.base1+this.base2);
  }
  
  /**
   * This method returns the top base length of the trapezoid.
   * @return the top base of the trapezoid
   */
  
  public int getBase1() {
    return this.base1;
  }
  
  /**
   * This method returns the bottom base length of the trapezoid.
   * @return the bottom base of the trapezoid
   */
  
  public int getBase2() {
    return this.base2;
  }
  
  /**
   * This method returns the height of the trapezoid.
   * @return the height of the trapezoid
   */
  
  public int getHeight() {
    return this.height;
  }
}