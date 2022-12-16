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

class TestStandardCalc {

  @Test
  public void testEvalThrowsEmpty() throws InvalidExpression {
    StandardCalc c = new StandardCalc();
    assertThrows(InvalidExpression.class, () -> c.evaluate(""),
        "c should throw expection as the string is empty and that is an invalid expression");
  }

  @Test
  public void testUserInput() throws InvalidExpression, BadTypeException {
    StandardCalc c = new StandardCalc();
    String input = "20";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), 20.0,
        "Evaluate should return 20 as that was "
        + "the given inputstream with no calcuation funtionality");
  }

  @Test
  public void testCalcuation() throws InvalidExpression, BadTypeException {
    StandardCalc c = new StandardCalc();
    String input = "5 + 10";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    assertEquals(c.evaluate("hi"), "5 10 +",
        "StandardCalc should return 5 + 10 in Reverse Polish notation");
  }



}
