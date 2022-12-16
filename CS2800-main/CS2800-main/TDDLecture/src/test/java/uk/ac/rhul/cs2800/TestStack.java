package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;
/**
 * @author zjac115
 *
 */

class TestStack {

  @Test
  public void testSize() {
    Stack s = new Stack();
    assertEquals(s.size(), 0, "Test a newly created stack to see that it has size zero.");
  }

  @Test
  void testPush() {
    Stack s = new Stack();
    entry e = new entry(0, Symbol.DIVIDE, Type.NUMBER);
    s.push(e);
    assertEquals(s.size(), 1, "Test a newly created stack to see that it has size zero.");
  }

  @Test
  public void testEmptyPop() {
    Stack s = new Stack();
    assertThrows(EmptyStackException.class, () -> s.pop(), "You cannot pop from an empty stack");
  }

  @Test
  public void pushThenPop() throws EmptyStackException {
    Stack s = new Stack();
    entry e = new entry(0, Symbol.DIVIDE, Type.STRING);
    s.push(e);
    assertEquals(s.pop(), e, "Pushing a five then popping it should return 5");
    assertEquals(s.size(), 0, "Pushing a five then poping it should give an empty stack");
    assertThrows(EmptyStackException.class, () -> s.pop(),
        "Push pop pop should throw an exception.");
  }

  @Test
  public void pushTwice() throws EmptyStackException {
    Stack s = new Stack();
    entry e = new entry(0, Symbol.DIVIDE, Type.STRING);
    entry e1 = new entry(0, Symbol.PLUS, Type.INVALID);
    s.push(e);
    s.push(e1);
    assertEquals(s.pop(), e1, "Pushing twice then popping should return the second thing pushed.");
    assertEquals(s.pop(), e, "Pushing twice then popping should return the first thing pushed");
    assertEquals(s.size(), 0, "Pushing a five then popping it should give an empty stack.");
    assertThrows(EmptyStackException.class, () -> s.pop(),
        "Push,pop, pop shuld throw an exception");
  }

  @Test
  public void topTest() throws EmptyStackException {
    Stack s = new Stack();
    entry e = new entry(0, Symbol.DIVIDE, Type.NUMBER);
    entry e1 = new entry(0, Symbol.MINUS, Type.SYMBOL);
    s.push(e);
    s.push(e1);
    assertEquals(s.top(), e,
        "Pushing twice then calling top on the first entry should return the first entry pushed.");

  }
}
