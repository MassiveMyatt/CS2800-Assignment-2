package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *
 */
public class BadTypeException extends Exception { // exception created to handle bad types.
  private static final long serialVersionUID = 1L;

  /**
   * @param msg uses given message as argument.
   */
  public BadTypeException(String msg) {
    super("Invalid input type" + msg);
  }
}
