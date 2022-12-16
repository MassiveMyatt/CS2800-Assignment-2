package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author zjac115
 *
 */
class TestEntry {

  @Test
  public void testNum() throws BadTypeException {
    entry e = new entry(0, null, null);
    assertEquals(e.getValue(), 0, "Testing that a newly created entry has a value of 0 and null.");
  }

  @Test
  public void testOther() throws BadTypeException {
    entry e = new entry(0, Symbol.INVALID, null);
    assertEquals(e.getSymbol(), Symbol.INVALID,
        "Test to see if the newly created entry's symbol is INVALID");
  }

  @Test
  public void testType() throws BadTypeException {
    entry e = new entry(0, null, Type.SYMBOL);
    assertEquals(e.getType(), Type.SYMBOL,
        "Test to see if the newly created entry has a type of symbol");
  }

  @Test
  public void testString() {
    entry e = new entry(0, null, null);
    assertEquals(e.toString(), "entry [number=0.0, symbol=null, type=null]",
        "Test to see if newly create entry has a string value of test");
  }

  @Test
  public void testAll() throws BadTypeException {
    entry e = new entry(5, Symbol.PLUS, Type.NUMBER);
    assertEquals(e.getValue(), 5, "Testing that a newly created entry has a value of 5");
    assertEquals(e.getSymbol(), Symbol.PLUS,
        "Test to see if the newly created entry's other is INVALID");
    assertEquals(e.toString(), "entry [number=5.0, symbol=PLUS, type=NUMBER]",
        "Test to see if toString operates properly");
  }
}
