package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

/**
 * @author zjac115
 *
 */

class TestRevPolishCalc {

  @Test
  public void testEvalThrowsEmpty() throws InvalidExpression {
    RevPolishCalc c = new RevPolishCalc();
    assertThrows(InvalidExpression.class, () -> c.evaluate(""),
        "c should throw expection as the string is empty and that is an invalid expression");
  }

  // @Test
  // public void testInputStream() throws InvalidExpression {
  // RevPolishCalc c = new RevPolishCalc();
  // assertEquals(c.evaluate("System.in"), "System.in", "Testing evaluate returns system.in so that
  // it will take an inputstream");
  // }

  @Test
  public void testUserInput() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "13";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 13.0,
        "Evaluate should return 13 as that was the given inputstream");
  }

  @Test
  public void testingCalculations() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "1 3 +";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 4.0,
        "Evaluate should return 4 as per polish notation, we're adding 1 and 3");
  }

  @Test
  public void testingCalculationsMinus() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "5 2 -";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 3.0,
        "Evaluate should return 3 as per polish notation, we're minusing 2 from 5");
  }

  @Test
  public void testingCalculationsMulti() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "10 5 *";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 50.0,
        "Evaluate should return 3 as per polish notation, we're multiplying 10 and 5");
  }

  @Test
  public void testingCalculationsdivide() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "200 2 /";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 100.0,
        "Evaluate should return 3 as per polish notation, we're dividing 200 by 2");
  }

  @Test
  public void testingForInvalid() throws InvalidExpression, BadTypeException {
    RevPolishCalc c = new RevPolishCalc();
    String input = "namaste fsdfdsfsdfsd &";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertThrows(InvalidExpression.class, () -> c.evaluate("hi"),
        "c should throw expection as the given input has invalid entries");
  }

}
