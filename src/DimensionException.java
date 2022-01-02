/**
 * [DimensionException.java]
 * The class represents a custom exception to make sure that certain dimensions inputted by the user
 * are valid depending on the other side lengths of the shape.
 * Inherits from the general exception class.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public class DimensionException extends Exception {
  
  /**
   * Creates an object from the DimensionException class.
   * @param message the message displayed when the exception occurs
   */
  
  DimensionException(String message) {
    super(message);
  }
}