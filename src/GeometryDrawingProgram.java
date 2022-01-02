/* ------------ IMPORTS ------------ */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
/* -------------------------------- */

/**
 * [GeometryDrawingProgram.java]
 * The program allows the user to add shapes, remove shapes, translate shapes and save and load files on to a cartesian plane.
 * The user interacts with the program through the console and inputs the necessary information of the shape in order to draw it.
 * The user will be told exactly what to input to the console. 
 * The program also displays the shapes added on to a graphics panel that can be seen by the user. 
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class GeometryDrawingProgram {
  
  /** Stores the object of the JFrame class. */
  static JFrame frame;
  /** Stores the two dimensional shape objects currently on the grid. */
  static ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
  /** The scanner variable used for input from the user. */
  static Scanner sc = new Scanner(System.in);
  /** Stores the current two dimensional shape specified. */
  static Shape2D shape;
  /** Stores all of the x coordinates on the shape. */
  static int[] xCoordinates;
  /** Stores all of the y coordinates on the shape. */
  static int[] yCoordinates;
  /** Stores the x coordinate of the shape's reference point. */
  static int x;
  /** Stores the y coordinate of the shape's reference point. */
  static int y;
  /** Stores the length of the shape. */
  static int length;
  /** Stores the width of the shape. */
  static int width;
  /** Stores the length of the screen. */
  static int screenLength = 520;
  /** Stores the width of the screen. */
  static int screenWidth = 520;
  /** Stores input that the user provides for a list of options. */
  static int input = 0;
  
  public static void main(String[] args) throws Exception{  
    
    /* ----------------- VARIABLES ---------------------- */
    
    /** Stores the object referring to the GeometryScreen class. */
    GeometryScreen gs = new GeometryScreen();
    /** The scanner variable used for input from a file. */
    Scanner fileInput;
    /** The printwriter variable used to output to a file. */
    PrintWriter output;
    /** Stores whether the program should quit or not. */
    boolean quit = false;
    /** Stores the base of the shape. */
    int base;
    /** Stores the top base of the shape. */
    int base1;
    /** Stores the bottom base of the shape. */
    int base2;
    /** Stores the height of the shape.  */
    int height;
    /** Stores the radius of the shape. */
    int radius;
    /** Stores the radius of the shape on the major axis. */
    int radius1;
    /** Stores the radius of the shape on the minor axis. */
    int radius2;
    /** Stores the side length of the shape. */
    int side;
    /** Stores the horizontal shift applied to the shape(s). */
    int horizontal;
    /** Stores the vertical shift applied to the shape(s). */
    int vertical;
    /** Stores the name of the file. */
    String name;
    /** Stores the name of the shape from the file. */
    String str;
    /** Stores the file that is being saved to or loaded from. */
    File file;
    /** Stores whether an exception has occured or not. */
    boolean exception;
    
    /* ------------------------------------------------ */
    
    //the main loop that constantly draws shapes to the screen and requests for user input
    do {
      //update the screen
      frame.repaint();
      //list the data of the shapes that are on the grid
      listShapes();
      
      //list of menu options available (add shape, remove shape, translate, save and load drawing to file)
      System.out.println("\n------------------ MENU OPTIONS --------------------");
      System.out.println("1. Add a shape!");
      System.out.println("2. Remove a shape!");
      System.out.println("3. Translate a shape!");
      System.out.println("4. Translate entire drawing!");
      System.out.println("5. Save drawing to a file!");
      System.out.println("6. Load drawing from a file!");
      System.out.println("7. Quit the program!");
      System.out.println("---------------------------------------------------");
      
      //taking the user input for the options above
      System.out.println("Please indicate what option you would like to select: ");
      input = validateOption(1,7);
      
      //user chooses to add a shape
      if (input == 1) {
        //list of shapes that could be added
        System.out.println("-------------- SHAPE OPTIONS TO ADD -----------------");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Ellipse");
        System.out.println("5. Triangle");
        System.out.println("6. Trapezoid");
        System.out.println("7. Parallelogram");
        System.out.println("8. Rhombus");
        System.out.println("----------------------------------------------------");
        
        //taking the user input for the options above
        System.out.println("Please indicate what shape option you would like to select: ");
        input = validateOption(1,8);
        
        //user chooses to add a square
        if (input == 1) {
          
          //the side length of the square
          System.out.println("Enter the side length of the square: ");
          length = checkNegDimension();
          
          //the x-coordinate of the square
          System.out.println("Enter the x coordinate of the square's top left corner: ");
          x = sc.nextInt();
          
          //the y-coordinate of the square
          System.out.println("Enter the y coordinate of the square's top left corner: ");
          y = sc.nextInt();
          
          //adding the new square object to the arraylist
          shapes.add(new Square("Square",x,y,length));
          
        //user chooses to add a circle
        } else if (input == 2) {
          
          //the radius of the circle
          System.out.println("Enter the radius of the circle: ");
          radius = checkNegDimension();
          
          //the x-coordinate of the circle's center
          System.out.println("Enter the x coordinate of the circle's center: ");
          x = sc.nextInt();
          
          //the y-coordinate of the circle's center
          System.out.println("Enter the y coordinate of the circle's center: ");
          y = sc.nextInt();
          
          //adding the new circle object to the arraylist
          shapes.add(new Circle("Circle",x,y,radius));
          
        //user chooses to add a rectangle
        } else if (input == 3) {
          
          //the length of the rectangle
          System.out.println("Enter the length of the rectangle: ");
          length = checkNegDimension();
          
          //the width of the rectangle
          System.out.println("Enter the width of the rectangle: ");
          width = checkNegDimension();
          
          //the x-coordinate of the rectangle
          System.out.println("Enter the x coordinate of the rectangle's top left corner: ");
          x = sc.nextInt();
          
          //the y-coordinate of the rectangle
          System.out.println("Enter the y coordinate of the rectangle's top left corner: ");
          y = sc.nextInt();
          
          //adding the new rectangle object to the arraylist
          shapes.add(new Rectangle("Rectangle",x,y,length,width));
          
        //user chooses to add an ellipse
        } else if (input == 4) {
          
          //the radius of the ellipse on the major axis
          System.out.println("Enter the radius of the ellipse on its major axis: ");
          radius1 = checkNegDimension();
          
          //the radius of the ellipse on the minor axis
          System.out.println("Enter the radius of the ellipse on its minor axis: ");
          radius2 = checkNegDimension();
          
          //the x-coordinate of the ellipse's center
          System.out.println("Enter the x coordinate of the ellipse's center: ");
          x = sc.nextInt();
          
          //the y-coordinate of the ellipse's center
          System.out.println("Enter the y coordinate of the ellipse's center: ");
          y = sc.nextInt();
          
          //adding the new ellipse object to the arraylist
          shapes.add(new Ellipse("Ellipse",x,y,radius1,radius2));
          
        //user chooses to add a triangle
        } else if (input == 5) {
          
          //the base of the triangle
          System.out.println("Enter the base of the triangle: ");
          base = checkNegDimension();
          
          //the height of the triangle
          System.out.println("Enter the height of the triangle: ");
          height = checkNegDimension();
          
          //the x-coordinate of the triangle
          System.out.println("Enter the x coordinate of the triangle's top left corner: ");
          x = sc.nextInt();
          
          //the y-coordinate of the triangle
          System.out.println("Enter the y coordinate of the triangle's top left corner: ");
          y = sc.nextInt();
          
          //adding the new triangle object to the arraylist
          shapes.add(new Triangle("Triangle",x,y,base,height));
          
        //user chooses to add a trapezoid
        } else if (input == 6) {
          
          //the top base of the trapezoid
          System.out.println("Enter the top base of the trapezoid: ");
          base1 = checkNegDimension();
          
          //the bottom base of the trapezoid
          System.out.println("Enter the bottom base of the trapezoid: ");
          base2 = checkNegDimension();
          
          //the height of the trapezoid
          System.out.println("Enter the height of the trapezoid: ");
          height = checkNegDimension();
          
          //the x-coordinate of the trapezoid
          System.out.println("Enter the left most x coordinate of the trapezoid: ");
          x = sc.nextInt();
          
          //the y-coordinate of the trapezoid
          System.out.println("Enter the top most y coordinate of the trapezoid: ");
          y = sc.nextInt();
          
          //adding the new trapezoid object to the arraylist
          shapes.add(new Trapezoid("Trapezoid",x,y,base1,base2,height));
          
        //user chooses to add a parallelogram
        } else if (input == 7) {
          
          //the base of the parallelogram
          System.out.println("Enter the base of the parallelogram: ");
          base = checkNegDimension();
          
          //the length of the parallelogram
          System.out.println("Enter the side length of the parallelogram: ");
          side = checkNegDimension();
          
          //the height of the parallelogram
          System.out.println("Enter the height of the parallelogram: ");
          
          //the height must be smaller than or equal to the side length, otherwise a DimensionException occurs
          do {
            exception = false;
            height = checkNegDimension();
            try {
              checkParallelogram(height,side);
            } catch (Exception e) {
              System.out.println("Exception occured: " + e);
              System.out.println("Please enter a height that is less than the side length: ");
              exception = true;
            } 
          } while (exception);
          
          //the x-coordinate of the parallelogram
          System.out.println("Enter the left most x coordinate of the parallelogram: ");
          x = sc.nextInt();
          
          //the y-coordinate of the parallelogram
          System.out.println("Enter the top most y coordinate of the parallelogram: ");
          y = sc.nextInt();
          
          //adding the new parallelogram object to the arraylist
          shapes.add(new Parallelogram("Parallelogram",x,y,base,height,side));
          
        //user chooses to add a rhombus
        } else {
          
          //the base of the rhombus
          System.out.println("Enter the base of the rhombus: ");
          base = checkNegDimension();
          
          //the height of the rhombus
          System.out.println("Enter the height of the rhombus: ");
          
          //similarly to the parallelogram, the height must be less than or equal to the side length, otherwise an exception occurs
          do {
            exception = false;
            height = checkNegDimension();
            try {
              checkParallelogram(height,base);
            } catch (Exception e) {
              System.out.println("Exception occured: " + e);
              System.out.println("Please enter a height that is less than the side length: ");
              exception = true;
            } 
          } while (exception);
          
          //the x-coordinate of the rhombus
          System.out.println("Enter the left most x coordinate of the rhombus: ");
          x = sc.nextInt();
          
          //the y-coordinate of the rhombus
          System.out.println("Enter the top most y coordinate of the rhombus: ");
          y = sc.nextInt();
          
          //adding the new rhombus object to the arraylist
          shapes.add(new Rhombus("Rhombus",x,y,base,height));
        }
        
      //user chooses to remove a shape
      } else if (input == 2) {
        
        //if there are no shapes currently on the grid, there is nothing to remove
        if (shapes.size() == 0) {
          System.out.println("There are no shapes on the grid for you to remove!");
          
        } else {
          //the user inputs the index number of the shape that they want to remove
          System.out.println("From the list of shapes on the grid, enter the shape number that you would like to remove: ");
          input = validateOption(1,shapes.size());
          
          //simply remove the shape at that index from the arraylist
          shapes.remove(input-1);
          System.out.println("You have removed shape #" + input + "!");
        }
        
      //user chooses to translate a shape
      } else if (input == 3) {
        
        //if there are no shapes currently on the grid, there is nothing to translate
        if (shapes.size() == 0) {
          System.out.println("There are no shapes on the grid for you to translate!");
          
        } else {
          //the user inputs the index number of the shape that they want to translate
          System.out.println("From the list of shapes on the grid, enter the shape number that you would like to translate: ");
          input = validateOption(1,shapes.size());
          
          //user inputs the value of the horizontal and vertical shift
          //a negative horizontal shift represents a shift to the left, a positive horizontal shift represents a shift to the right
          //a negative vertical shift represents a shift upwards, a positive vertical shift represents a shift downwards
          System.out.println("Enter the number of units that you would like the shape to horizontally translate by: ");
          horizontal = sc.nextInt();
          System.out.println("Enter the number of units that you would like the shape to vertically translate by: ");
          vertical = sc.nextInt();
          
          //depending on whether the shape is simple or complex, it has its own translate method
          if (shapes.get(input-1) instanceof SimpleShape) {
            ((SimpleShape)(shapes.get(input-1))).translate(horizontal,vertical);
          } else {
            ((ComplexShape)(shapes.get(input-1))).translate(horizontal,vertical);
          }
          
          System.out.println("You have translated shape #" + input + ", " + horizontal + " units horizontally and " + vertical + " units vertically!");
        }
        
      //user chooses to translate all the shapes
      } else if (input == 4) {
        
        //if there are no shapes currently on the grid, there is nothing to translate
        if (shapes.size() == 0) {
          System.out.println("There are no shapes on the grid for you to translate!");
          
        } else {
          //user inputs the value of the horizontal and vertical shift
          //same concept for positive and negative shifts as explained above
          System.out.println("Enter the number of units that you would like all the shapes to horizontally translate by: ");
          horizontal = sc.nextInt();
          System.out.println("Enter the number of units that you would like all the shapes to vertically translate by: ");
          vertical = sc.nextInt();
          
          //translate every shape in the arraylist by the specified shifts
          for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof SimpleShape) {
              ((SimpleShape)shapes.get(i)).translate(horizontal,vertical);
            } else {
              ((ComplexShape)shapes.get(i)).translate(horizontal,vertical);
            }
          }
          
          System.out.println("You have translated all shapes " + horizontal + " units horizontally and " + vertical + " units vertically!");
        }
        
      //user chooses to save the drawing to a file
      } else if (input == 5) {
        
        //user inputs the name of the file that he wants to save the drawing in
        System.out.println("Enter the name of the file that you want to save this drawing to: ");
        name = sc.next();
        file = new File(name + ".txt");
        output = new PrintWriter(file);
        
        //for all of the shapes in the arraylist, save all of the shapes important data including its type, coordinates, and dimensions
        //this information is in the same order as it was requested when adding a shape
        for (int i = 0; i < shapes.size(); i++) {
          shape = shapes.get(i);
          //saving the shape's type
          output.print(shape.getType() + " ");
          
          if (shape instanceof Square) {
            //saving the square's side length
            output.print(((Square)shape).getLength());
            
          } else if (shape instanceof Circle) {
            //saving the circle's radius
            output.print(((Circle)shape).getRadius1());
            
          } else if (shape instanceof Rectangle) {
            //saving the rectangle's length and width
            output.print(((Rectangle)shape).getLength() + " " + ((Rectangle)shape).getWidth());
            
          } else if (shape instanceof Ellipse) {
            //saving the ellipse's two radii
            output.print(((Ellipse)shape).getRadius1() + " " + ((Ellipse)shape).getRadius2());
            
          } else if (shape instanceof Rhombus) {
            //saving the rhombus' base and height
            output.print(((Rhombus)shape).getBase() + " " + ((Rhombus)shape).getHeight());
            
          } else if (shape instanceof Parallelogram) {
            //saving the parallelogram's base, side length and height
            output.print(((Parallelogram)shape).getBase() + " " + ((Parallelogram)shape).getSide() + " " + ((Parallelogram)shape).getHeight());
            
          } else if (shape instanceof Triangle) {
            //saving the triangle's base and height
            output.print(((Triangle)shape).getBase() + " " + ((Triangle)shape).getHeight());
            
          } else {
            //saving the trapezoid's two bases and height
            output.print(((Trapezoid)shape).getBase1() + " " + ((Trapezoid)shape).getBase2() + " " + ((Trapezoid)shape).getHeight());
          }
          //saving the shape's x and y coordinate
          output.println(" " + shape.getX() + " " + shape.getY());
        }
        
        //closing the printwriter
        output.close();
        
        System.out.println("You have saved the drawing to the file: " + name + ".txt!");
        
      //user chooses to load the drawing from a file
      } else if (input == 6) {
        
        //user inputs the name of the file that is loading the drawing
        System.out.println("Enter the name of the file that you want to read from: ");
        name = sc.next();
        file = new File(name + ".txt");
        fileInput = new Scanner(file);
        
        //reading all of the information in the specified file
        //the contents of the file must have the data of the shapes in the same order as the program requested when adding a shape to the grid
        while (fileInput.hasNext()) {
          str = fileInput.next();
          
          if (str.equals("Square")) {
            length = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Square(str,x,y,length));
            
          } else if (str.equals("Circle")) {
            radius = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Circle(str,x,y,radius));
            
          } else if (str.equals("Rectangle")){ 
            length = fileInput.nextInt();
            width = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Rectangle(str,x,y,length,width));
            
          } else if (str.equals("Ellipse")) {
            radius1 = fileInput.nextInt();
            radius2 = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Ellipse(str,x,y,radius1,radius2));
            
          } else if (str.equals("Triangle")) {
            base = fileInput.nextInt();
            height = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Triangle(str,x,y,base,height));
            
          } else if (str.equals("Trapezoid")) {
            base1 = fileInput.nextInt();
            base2 = fileInput.nextInt();
            height = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Trapezoid(str,x,y,base1,base2,height));
            
          } else if (str.equals("Parallelogram")) {
            base = fileInput.nextInt();
            side = fileInput.nextInt();
            height = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Parallelogram(str,x,y,base,height,side));
            
          } else {
            base = fileInput.nextInt();
            height = fileInput.nextInt();
            x = fileInput.nextInt();
            y = fileInput.nextInt();
            shapes.add(new Rhombus(str,x,y,base,height));
          }
        }
        
        System.out.println("You have loaded the drawing from the file: " + name + ".txt!");
        
      //user chooses to quit the program
      } else {
        System.out.println("Thank you for using my geometry drawing program!");
        
        //change the boolean variable to true to exit the do-while loop
        quit  = true;
      }
      
    } while(!quit);
    
    //closing the scanner class and exiting the program
    sc.close();
    System.exit(0);
  }
  
  /**
   * This method checks if the inputted dimension for any shape is a positive number.
   * It continuously requests for input until the user provides a valid dimension.
   * @return the valid inputted dimension
   */
  
  static int checkNegDimension() {
    input = sc.nextInt();
    while (input <= 0) {
      System.out.println("Please enter a positive, integer dimension: ");
      input = sc.nextInt();
    }
    return input;
  }
  
  /**
   * This method checks if the inputted dimension for rhombuses or parallelograms are valid.
   * It throws a DimensionException if the input is not valid.
   * @param height the height of the shape
   * @param side     the side length of the shape
   */
  
  static void checkParallelogram(int height, int side) throws Exception {
    if (height > side) {
      throw new DimensionException("Invalid Dimension! Height must be smaller than side length!");
    }
  }
  
  /**
   * This method takes input from the user and checks if the input lies within the options available.
   * Once a valid input is found, the method returns it.
   * @param start the first number in the options available
   * @param end  the last number in the options available
   * @return          the valid input option
   */
  
  static int validateOption(int start, int end) {
    input = sc.nextInt();
    while (input < start || input > end) {
      System.out.println("Please enter a valid option number: ");
      input = sc.nextInt();
    }
    return input;
  }
  
  /**
   * This method prints all of the data of the shapes that are currently on the grid.
   * It lists the shapes type, coordinates, area and perimeter.
   */
  
  static void listShapes() {
    System.out.println("\n---------------LIST OF SHAPES ON GRID----------------");
    
    //if no shapes are currently on the grid, there is nothing to list
    if (shapes.size() == 0) {
      System.out.println("There are currently no shapes!");
      
    //for every shape in the arraylist, list the shapes type, coordinates, area and perimeter
    } else {
      
      for (int i = 1; i <= shapes.size(); i++) {
        shape = shapes.get(i-1);
        System.out.println("Shape #" + i + ": " + shape.getType());
        System.out.print("Coordinates: ");
        
        //for complex shapes, simply print all of the x and y coordinates in the array
        if (shape instanceof ComplexShape) {
          xCoordinates = ((ComplexShape)shape).getXCoordinates();
          yCoordinates = ((ComplexShape)shape).getYCoordinates();
          System.out.print("(" + xCoordinates[0] + "," + yCoordinates[0] + ")");
          for (int j = 1; j < ((ComplexShape)shape).getNumberOfSides(); j++) {
            System.out.print(", (" + xCoordinates[j] + "," + yCoordinates[j] + ")");
          }
          System.out.println();
          
        } else {
          x = shape.getX();
          y = shape.getY();
          
          //getting the four corners of the rectangle/square using its top left corner and its dimensions
          if (shape instanceof Rectangle) {
            length = ((Rectangle)shape).getLength();
            width = ((Rectangle)shape).getWidth();
            System.out.println("(" + x + "," + y + "), (" + (x+length) + ", " + y + "), (" + (x+length) + "," + (y+width) + "), (" + x + "," + (y+width) + ")");
            
          //getting the center of the ellipse/circle
          } else {
            System.out.println("(" + x + "," + y + ")");
          }
        }
        
        System.out.println("Area: " + shape.getArea() + " units squared");
        System.out.println("Perimeter: " + shape.getPerimeter() + " units");
        System.out.println("----------------------------------------------------");
      }
    }
    System.out.println("---------------------------------------------------");
  }
  
 /**
 * The class is an inner class of GeometryDrawingProgram that creates the screen that the shapes are drawn in.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */
  
  public static class GeometryScreen {
    
    /**
   * Creates an object from the GeometryScreen class.
   */
    
    GeometryScreen() {
      frame = new JFrame("Geometry Drawing Program 1.0");
      
      //Create a new "custom" panel for graphics based on the inner class below
      JPanel graphicsPanel = new GraphicsPanel();
      
      //Add the panel and the frame to the window
      frame.getContentPane().add(graphicsPanel);
      
      // Set the frame to full screen 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(screenLength,screenWidth);
      
      //Set to true to remove title bar
      frame.setUndecorated(false);
      frame.setVisible(true);
      
    } 
    
 /**
 * The class is an inner class of GeometryScreen that draws the shapes and the grid to the screen.
 * The class inherits from the general JPanel class and uses the Graphics class to draw.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */
    
    public static class GraphicsPanel extends JPanel {
      
   /**
   * This method draws the shapes and the grid to the screen.
   * @param g the graphics variable used to draw the shapes and grid
   */
      
      public void paintComponent(Graphics g) {          
        setDoubleBuffered(true);   
        
        //creating the grid class and calling its draw method
        Grid grid = new Grid(screenLength,screenWidth,g);
        grid.drawGrid();
        
        //initializing all colours used for shapes
        Color red = new Color(255,0,0);
        Color orange = new Color(255,140,0);
        Color yellow = new Color(218,165,32);
        Color green = new Color(0,128,0);
        Color blue = new Color(0,0,255);
        Color purple = new Color(128,0,128);
        Color pink = new Color(255,0,255);
        Color brown = new Color(139,69,19);
        
        for (int i = 0; i < shapes.size(); i++) {
          Shape2D shape = shapes.get(i);
          if (shape instanceof SimpleShape) {
            x = shape.getX();
            y = shape.getY();
            
            //giving individual colours for each type of shape
            if (shape instanceof Ellipse) {
              if (shape instanceof Circle) {
                g.setColor(red);
              } else {
                g.setColor(orange);
              }
              
              //drawing the ellipse/circle
              g.drawOval(x-((Ellipse)shape).getRadius1()+260,-y-((Ellipse)shape).getRadius2()+260,((Ellipse)shape).getRadius1()*2,((Ellipse)shape).getRadius2()*2);
              
            } else {
              if (shape instanceof Square) {
                g.setColor(green);
              } else {
                g.setColor(blue);
              }
              
              //drawing the rectangle/square
              g.drawRect(x+260,-y+260,((Rectangle)shape).getLength(),((Rectangle)shape).getWidth());
            }
            
          } else {
            if (shape instanceof Rhombus) {
              g.setColor(pink);
            } else if (shape instanceof Parallelogram) {
              g.setColor(purple);
            } else if (shape instanceof Triangle) {
              g.setColor(yellow);
            } else {
              g.setColor(brown);
            }
            
            //drawing the complex shape
            int[] modifiedX = Arrays.copyOf(((ComplexShape)shape).getXCoordinates(),((ComplexShape)shape).getNumberOfSides());
            int[] modifiedY = Arrays.copyOf(((ComplexShape)shape).getYCoordinates(),((ComplexShape)shape).getNumberOfSides());
            for (int z = 0; z < modifiedX.length; z++) {
              modifiedX[z] += 260;
              modifiedY[z] = -modifiedY[z] + 260;
            }
            g.drawPolygon(modifiedX,modifiedY,((ComplexShape)shape).getNumberOfSides());
          }
        }
      }
    }
  }
}
