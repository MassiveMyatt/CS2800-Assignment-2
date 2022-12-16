package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *      This is an abstract interface class which will be used on two other facades.
 */

public abstract interface Calculator {

  /**
   * @param what is taken to define the type of inputstream.
   * @return
   * @throws InvalidExpression if expression is invalid.
   * @throws BadTypeException if type is invalid.
   */
  public abstract float evaluate(String what) throws InvalidExpression, BadTypeException;


}
