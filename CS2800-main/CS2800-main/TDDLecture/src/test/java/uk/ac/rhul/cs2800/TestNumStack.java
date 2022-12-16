package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author zjac115
 *
 */
class TestNumStack {

  @Test
  public void testPush() {
    numStack s = new numStack();
    entry e = new entry(5, null, null);
    s.push(e);
    assertEquals(s.size(), 1, "Testing to check value 5 has been pushed to stack");

  }

  @Test
  public void testPop() {
    numStack s = new numStack();
    entry e = new entry(5, null, null);
    s.push(e);
    assertEquals(s.pop(), e, "Pushing e then poping should return e");
  }

  @Test
  public void testTop() {
    numStack s = new numStack();
    entry e = new entry(5, null, null);
    entry e1 = new entry(6, null, null);
    s.push(e);
    s.push(e1);
    assertEquals(s.top(), e, "Pushing e and e1 then calling top should return e that was pushed.");
  }

  @Test
  public void testIsEmpty() {
    numStack s = new numStack();
    assertEquals(s.isEmpty(), true, "Stack is empty so it should return true");
  }

  @Test
  public void testFull() {
    numStack s = new numStack();
    entry e = new entry(5, null, null);
    entry e1 = new entry(6, null, null);
    s.push(e);
    s.push(e1);
    assertEquals(s.isEmpty(), false, "Stack is not empty so it should return false");
  }
}
