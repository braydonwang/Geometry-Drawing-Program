/**
 * [Shape2D.java]
 * The class is an abstract class that creates two dimensional shape objects, which can be drawn and modified by the user.
 * All shapes available to the user fall under the Shape2D class.
 * All two dimensional shapes have basic data including coordinates for reference, area, perimeter and type. 
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

abstract class Shape2D {
  
  /** Stores the area of the shape. */
  private double area;
  /** Stores the perimeter of the shape. */
  private double perimeter;
  /** Stores the type of the shape. */
  private String type;
  /** Stores the x coordinate of the reference point of the shape. */
  private int x;
  /** Stores the y coordinate of the reference point of the shape. */
  private int y;
  
  /**
   * Creates an object from the Shape2D class.
   * @param type     the type of the shape
   * @param x          the x coordinate of the shape's reference point
   * @param y          the y coordinate of the shape's reference point
   */
  
  Shape2D(String type, int x, int y) {
    this.type = type;
    this.x = x;
    this.y = y;
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
   * This method returns the area of the shape.
   * @return the area of the shape
   */
  
  public double getArea() {
    return this.area;
  }
  
  /**
   * This method returns the perimeter of the shape.
   * @return the perimeter of the shape
   */
  
  public double getPerimeter() {
    return this.perimeter;
  }
  
  /**
   * This method returns the x coordinate of the shape.
   * @return the x coordinate
   */
  
  public int getX() {
    return this.x;
  }
  
  /**
   * This method returns the y coordinate of the shape.
   * @return the y coordinate
   */
  
  public int getY() {
    return this.y;
  }
  
  /**
   * This method returns the type of the shape.
   * @return the type of the shape
   */
  
  public String getType(){
    return this.type;
  }
  
  /**
   * This method replaces the current x coordinate with a new one.
   * @param x the new x coordinate
   */
  
  public void setX(int x){
    this.x = x;
  }
  
  /**
   * This method replaces the current y coordinate with a new one.
   * @param y the new y coordinate
   */
  
  public void setY(int y) {
    this.y = y;
  }
  
  /**
   * This method replaces the current area with a new one.
   * @param area the new area
   */
  
  public void setArea(double area) {
    this.area = area;
  }
  
  /**
   * This method replaces the current perimeter with a new one.
   * @param perimeter the new perimeter
   */
  
  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }
}