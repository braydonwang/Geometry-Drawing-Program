/**
 * [ComplexShape.java]
 * The class is an abstract class that holds the basic information of all complex shapes available to the user.
 * These complex shapes include triangles, trapezoids, parallelograms and rhombuses. 
 * All complex shapes have an array of coordinates and number of sides.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

abstract class ComplexShape extends Shape2D implements Translatable {
  
  /** Stores all x coordinates of the complex shape. */
  private int[] xCoordinates;
  /** Stores all y coordinates of the complex shape. */
  private int[] yCoordinates;
  /** Stores the number of sides of the complex shape. */
  private int numberOfSides;
  
  /**
   * Creates an object from the ComplexShape class.
   * @param type                    the type of the shape
   * @param x                         the x coordinate of the shape's reference point
   * @param y                         the y coordinate of the shape's reference point
   * @param numberOfSides  the number of sides of the shape
   */
  
  ComplexShape(String type, int x, int y, int numberOfSides) {
    super(type,x,y);
    this.numberOfSides = numberOfSides;
    xCoordinates = new int[numberOfSides];
    yCoordinates = new int[numberOfSides];
  }
  
  /**
   * An abstract method that enforces the calculation of the shape's area.
   */
  
  abstract void calculateArea();
  
  /**
   * An abstract method that enforces the calculation of the shape's perimeter.
   */
  
  abstract void calculatePerimeter();
  
  /**
   * This method translates every coordinate in the array by a horizontal and vertical shift.
   * @param horizontal the horizontal shift applied to the shape
   * @param vertical      the vertical shift applied to the shape
   */
  
  public void translate(int horizontal, int vertical) {
    for (int i = 0; i < this.numberOfSides; i++) {
      this.xCoordinates[i] += horizontal;
      this.yCoordinates[i] += vertical;
    }
  }
  
  /**
   * This method returns the array that holds all of the shape's x coordinates.
   * @return all of the x coordinates
   */
  
  public int[] getXCoordinates() {
    return this.xCoordinates;
  }
  
  /**
   * This method returns the array that holds all of the shape's y coordinates.
   * @return all of the y coordinates
   */
  
  public int[] getYCoordinates() {
    return this.yCoordinates;
  }
  
  /**
   * This method returns the number of sides that the shape has.
   * @return the number of sides
   */
  
  public int getNumberOfSides() {
    return this.numberOfSides;
  }
  
  /**
   * This method sets the new x coordinate at the specified index.
   * @param x     the new x coordinate
   * @param ind the index of the new x coordinate
   */
  
  public void setXCoordinates(int x, int ind) {
    this.xCoordinates[ind] = x;
  }
  
  /**
   * This method sets the new y coordinate at the specified index.
   * @param y     the new y coordinate
   * @param ind the index of the new y coordinate
   */
  
  public void setYCoordinates(int y, int ind) {
    this.yCoordinates[ind] = y;
  }
}