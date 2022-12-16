package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * @author zjac115
 *      This is a class that defines how the stack works within the calculator program.
 *
 */
public class Stack {

  private int size = 0; // creating a variable size to store 
                        // the position of the array of entries and
                        // keep track of how big the array is.
  entry[] value = new entry[10]; // creating our entry array to store up to 10 entries.

  /**
   * @return size which is the current size of the array.
   */
  public int size() {
    return size;
  }

  /**
   * @param i which is the given entry you want to push.
   */
  public void push(entry i) {
    value[size()] = i;
    size = size + 1;
  }

  /**
   * @return returning entry in the value array specified by size.
   */
  public entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    size = size - 1;
    return value[size()];
  }

  /**
   * @return returns first value in array.
   */
  public entry top() {
    if (size() < 0) {
      throw new EmptyStackException();
    }
    return value[0];


  }

}
