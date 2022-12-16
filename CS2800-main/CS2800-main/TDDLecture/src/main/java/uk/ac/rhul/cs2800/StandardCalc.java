package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * @author zjac115
 *      This is a class that takes Standard infix calculations and converts them into
 *      Reverse polish notation to be used in RevPolishCalc.java.
 *
 */
public class StandardCalc implements Calculator {

  /**
   * @param takes a symbol c.
   * @return a value based on its precedence according to mathematics.
   */
  static int precedence(Symbol c) {
    switch (c) {
      case PLUS:
      case MINUS:
        return 1;
      case TIMES:
      case DIVIDE:
        return 2;
      default:
        return -1;
    }

  }

  /**
   *
   */
  public float evaluate(String what) throws InvalidExpression, BadTypeException {
    if (what.equals("")) {
      throw new InvalidExpression("String was empty");
    }
    Scanner InputStream = new Scanner(System.in);
    opStack s = new opStack();
    String output = "";
    while (InputStream.hasNext()) {
      String f = InputStream.nextLine();
      for (int i = 0; i < f.length(); i++) {
        char c = f.charAt(i);
        Boolean isNum = Character.isDigit(f.charAt(i));
        if (isNum == true) {
          output += c;
        } else {
          if (c == '(') {
            entry e = new entry(0, Symbol.LEFT_BRACKET, null);
            s.push(e);
          } else if (c == ')') {
            entry eT = s.top();
            while ((s.isEmpty() == false) && (eT.getSymbol() != Symbol.LEFT_BRACKET)) {
              output += s.pop();
            }
            s.pop();
          } else {

            switch (c) {
              case '+':
                entry e = new entry(0, Symbol.PLUS, null);
                s.push(e);
                break;
              case '-':
                entry e1 = new entry(0, Symbol.MINUS, null);
                s.push(e1);
                break;
              case '/':
                entry e2 = new entry(0, Symbol.DIVIDE, null);
                s.push(e2);
                break;
              case '*':
                entry e3 = new entry(0, Symbol.TIMES, null);
                s.push(e3);
                break;
              default:

            }
          }
          entry eT = s.top();
          if (s.size() > 1) {
            entry e4 = s.pop();
            while ((s.isEmpty() == false)
                && precedence(e4.getSymbol()) <= precedence(eT.getSymbol())) {
              output += s.pop();
            }
          }
          switch (eT.getSymbol()) {
            case PLUS:
              output += '+';
              break;
            case MINUS:
              output += '-';
              break;
            case TIMES:
              output += '*';
              break;
            case DIVIDE:
              output += '/';
              break;
            default:
              break;
          }
        }

      }
    }
    InputStream.close();
    return 0;
  }

}
