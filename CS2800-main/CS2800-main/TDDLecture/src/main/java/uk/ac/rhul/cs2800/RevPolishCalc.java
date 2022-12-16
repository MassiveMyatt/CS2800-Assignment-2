package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * @author zjac115
 *      This class implements a calculator using reverse polish notation.
 * 
 */
public class RevPolishCalc implements Calculator {

  public float evaluate(String what) throws InvalidExpression, BadTypeException {
    if (what.equals("")) {
      throw new InvalidExpression("String was empty");
    }
    Scanner InputStream = new Scanner(System.in);
    numStack s = new numStack();
    while (InputStream.hasNext()) {
      if (InputStream.hasNextFloat()) {
        entry e = new entry(InputStream.nextFloat(), null, null);
        s.push(e);
      } else {
        String next = InputStream.next();

        switch (next) {
          case "+":
            entry en = s.top();
            en.setSymbol(Symbol.PLUS);
            break;
          case "-":
            entry en1 = s.top();
            en1.setSymbol(Symbol.MINUS);
            break;
          case "*":
            entry en2 = s.top();
            en2.setSymbol(Symbol.TIMES);
            break;
          case "/":
            entry en3 = s.top();
            en3.setSymbol(Symbol.DIVIDE);
            break;
          default:
            entry en4 = s.pop();
            en4.setSymbol(Symbol.INVALID);
            break;
        }
        entry e = s.top();
        entry e1 = s.pop();
        switch (e.getSymbol()) {
          case PLUS:
            float answer = e.getValue() + e1.getValue();
            entry e2 = new entry(answer, null, null);
            s.push(e2);
            break;
          case MINUS:
            float answer1 = e.getValue() - e1.getValue();
            entry e3 = new entry(answer1, null, null);
            s.push(e3);
            break;
          case TIMES:
            float answer2 = e.getValue() * e1.getValue();
            entry e4 = new entry(answer2, null, null);
            s.push(e4);
            break;
          case DIVIDE:
            float answer3 = e.getValue() / e1.getValue();
            entry e5 = new entry(answer3, null, null);
            s.push(e5);
            break;
          case INVALID:
            throw new InvalidExpression("Value is invalid");
          default:
            throw new InvalidExpression("Value not found");

        }
      }

    }
    InputStream.close();
    if (s.isEmpty() == true) {

      throw new InvalidExpression("Value not found");

    } else {
      entry e = s.pop();
      float answer = e.getValue();
      return answer;
    }



  }

}
