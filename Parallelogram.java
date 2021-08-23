/**
 * [Parallelogram.java]
 * The class represents the parallelogram shape, which inherits from the complex shape class.
 * All parallelograms have a base, height, side length and coordinates for reference.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Parallelogram extends ComplexShape {
  
  /** Stores the base of the parallelogram. */
  private int base;
  /** Stores the height of the parallelogram. */
  private int height;
  /** Stores the side length of the parallelogram. */
  private int side;
  
  /**
   * Creates an object from the Parallelogram class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the parallelogram's reference point
   * @param y          the y coordinate of the parallelogram's reference point
   * @param base    the base length of the parallelogram
   * @param height the height of the parallelogram
   * @param side     the side length of the parallelogram
   */
  
  Parallelogram(String type, int x, int y, int base, int height, int side) {
    super(type,x,y,4);
    this.base = base;
    this.height = height;
    this.side = side;
    
    //calculating and setting the x and y coordinates of the parallelogram using its dimensions and reference point given
    this.setXCoordinates(x+(int)(Math.sqrt(this.side*this.side-this.height*this.height)),0);
    this.setXCoordinates(x+(int)(Math.sqrt(this.side*this.side-this.height*this.height))+this.base,1);
    this.setXCoordinates(x+this.base,2);
    this.setXCoordinates(x,3);
    this.setYCoordinates(y,0);
    this.setYCoordinates(y,1);
    this.setYCoordinates(y+this.height,2);
    this.setYCoordinates(y+this.height,3);
    
    //calculating the parallelogram's area and perimeter
    calculateArea(); 
    calculatePerimeter();
  }
  
  /**
   * This method calculates the area of the parallelogram using the base and height.
   */
  
  public void calculateArea() {
    this.setArea(base*height);
  }
  
  /**
   * This method calculates the perimeter of the parallelogram using the base and side length.
   */
  
  public void calculatePerimeter() {
    this.setPerimeter(2.0*(this.base+this.side));
  }
  
  /**
   * This method returns the base length of the parallelogram.
   * @return the base length
   */
  
  public int getBase() {
    return this.base;
  }
  
  /**
   * This method returns the height of the parallelogram.
   * @return the height
   */
  
  public int getHeight() {
    return this.height;
  }
  
  /**
   * This method returns the side length of the parallelogram.
   * @return the side length
   */
  
  public int getSide() {
    return this.side;
  }
}