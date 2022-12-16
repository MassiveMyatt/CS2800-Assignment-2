package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *      This is a class that uses Stack to create a NumStack.
 */
public class numStack {
  private Stack s;

  public numStack() {
    s = new Stack(); // creates a new stack.
  }

  /**
   * @param i takes argument i which is an object entry
   */
  public void push(entry i) {
    s.push(i); // pushes to stack
  }

  /**
   * @return size of the stack.
   */
  public int size() {
    return s.size();
  }

  /**
   * @return value popped from the stack.
   */
  public entry pop() {
    return s.pop();
  }

  /**
   * @return value at the top of the stack.
   */
  public entry top() {
    return s.top();
  }

  /**
   * @return checks to see if stack is empty and returns a boolean depending on the outcome.
   */
  public boolean isEmpty() {
    if (s.size() == 0) {
      return true;
    } else {
      return false;
    }
  }

}
