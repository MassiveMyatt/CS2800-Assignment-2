package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author zjac115
 *
 */
class TestOpStack {

  @Test
  public void testPush() {
    opStack s = new opStack();
    entry e = new entry(0, Symbol.PLUS, null);
    s.push(e);
    assertEquals(s.size(), 1, "Testing to check e has been pushed to stack");

  }

  @Test
  public void testPop() {
    opStack s = new opStack();
    entry e = new entry(0, Symbol.DIVIDE, null);
    s.push(e);
    assertEquals(s.pop(), e, "Pushing e then poping should return e");
  }

  @Test
  public void testTop() {
    opStack s = new opStack();
    entry e = new entry(0, Symbol.DIVIDE, null);
    entry e1 = new entry(0, Symbol.PLUS, null);
    s.push(e);
    s.push(e1);
    assertEquals(s.top(), e, "Pushing e and e1 then calling top should return e that was pushed.");
  }

  @Test
  public void testIsEmpty() {
    opStack s = new opStack();
    assertEquals(s.isEmpty(), true, "Stack is empty so it should return true");
  }

  @Test
  public void testFull() {
    opStack s = new opStack();
    entry e = new entry(0, Symbol.DIVIDE, null);
    entry e1 = new entry(0, Symbol.PLUS, null);
    s.push(e);
    s.push(e1);
    assertEquals(s.isEmpty(), false, "Stack is not empty so it should return false");
  }
}
