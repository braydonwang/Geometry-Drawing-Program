/* ------------ IMPORTS ------------ */
import java.awt.Graphics;
import java.awt.Color;
/* -------------------------------- */

/**
 * [Grid.java]
 * The class represents the cartesian plane that encompasses all of the shapes on the screen.
 * The grid is constantly updated and drawn to the screen.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class Grid {
  
  /** Stores the length of the screen. */
  private int length;
  /** Stores the width of the screen. */
  private int width;
  /** Stores the graphics variable used to draw to the screen. */
  private Graphics g;
  
  /**
   * Creates an object from the Grid class.
   * @param length the length of the screen
   * @param width  the width of the screen
   * @param g         the graphics variable used to draw the grid to the screen
   */
  
  Grid(int length, int width, Graphics g) {
    this.length = length;
    this.width = width;
    this.g = g;
  }
  
  /**
   * This method draws the grid to the screen using the Graphics class.
   */
  
  public void drawGrid() {   
    
    //initializing all colours and setting it to be used
    Color grey = new Color(211,211,211);
    this.g.setColor(grey);
    
    //drawing the vertical lines of the grid
    for (int i = 0; i <= this.length; i+=20) {
      this.g.drawLine(i, 0, i, this.width);
    }
    
    //drawing the horizontal lines of the grid
    for (int i = 0; i <= this.width; i+=20) {
      this.g.drawLine(0, i, this.length, i);
    }
    
    //drawing the x and y axis in the middle of the grid
    this.g.setColor(Color.BLACK);
    this.g.drawLine(this.length/2,0,this.length/2,this.width);
    this.g.drawLine(0,this.width/2,this.length,this.width/2);
  }
}