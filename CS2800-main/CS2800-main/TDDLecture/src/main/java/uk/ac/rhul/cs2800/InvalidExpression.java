package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *      This is an exception class to catch invalid user inputs.
 *      
 */

public class InvalidExpression extends Exception { // exception to handle invalid expressions given
                                                   // by the user.
  /**
   * @param msg argument is given to give an accurate error message to the user
   */
  public InvalidExpression(String msg) {
    super("This expression was invalid" + msg);
  }
}
