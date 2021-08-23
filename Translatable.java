/**
 * [Translatable.java]
 * The interface translatable refers to all shapes that are able to translate on the grid.
 * Both simple shapes and complex shapes implement this interface, but offer different methods to translate the shapes.
 * @author Braydon Wang
 * @version 1.0, Oct 9, 2020
 */

public interface Translatable {
  
  /**
   * This method acts us the blueprint for all classes that implement the Translatable interface.
   * They must override this method with their own code.
   * @param horizontal the horizontal shift applied to the shape
   * @param vertical      the vertical shift applies to the shape
   */
  
  public void translate(int horizontal, int vertical);
}