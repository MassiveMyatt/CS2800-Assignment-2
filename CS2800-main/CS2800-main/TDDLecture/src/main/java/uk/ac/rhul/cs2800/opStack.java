package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *      This is a class that uses Stack to create an operator stack.
 */
public class opStack {
  private Stack s;

  public opStack() {
    s = new Stack();
  }

  /**
   * @param e argument i which is an object entry
   */
  public void push(entry e) {
    s.push(e); // pushes to stack.
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
