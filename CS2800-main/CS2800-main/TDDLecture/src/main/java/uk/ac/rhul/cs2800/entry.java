package uk.ac.rhul.cs2800;

/**
 * @author zjac115
 *
 */
public class entry {
  float number = 0;
  Symbol symbol = null;
  Type type = null;

  /**
   * @param number taken as argument in constructor.
   * @param symbol taken as argument in constructor.
   * @param type taken as argument in constructor.
   */
  public entry(float number, Symbol symbol, Type type) { // constructor to construct number and
                                                         // symbol.
    this.number = number;
    this.symbol = symbol;
    this.type = type;
  }

  /**
   * @return number held in value.
   * @throws BadTypeException if type is invalid.
   */
  public float getValue() throws BadTypeException { // method getValue() to return the number
                                                    // variable.
    return number;
  }

  /**
   * @return symbol held in symbol.
   * @throws BadTypeException if type is invalid.
   */
  public Symbol getSymbol() throws BadTypeException { // method getSymbol() to return the symbol
                                                      // variable.
    return symbol;
  }

  /**
   * @return type.
   */
  public Type getType() { // method getType to return type.
    return type;
  }

  /**
   * @return string output of class.
   */
  @Override
  public String toString() { // overriden toString method.
    return "entry [number=" + number + ", symbol=" + symbol + ", type=" + type + "]";
  }

  /**
   * @param f taken as argument to define what the user wants to set number as.
   * @throws BadTypeException if type is invalid.
   */
  public void setValue(float f) throws BadTypeException {
    this.number = f;
  }

  /**
   * @param s taken as argument to define what the user wants to set symbol as.
   * @throws BadTypeException if type is invalid
   */
  public void setSymbol(Symbol s) throws BadTypeException {
    this.symbol = s;
  }

  /**
   * @param t taken as argument to define what the user wants to set type as.
   * @throws BadTypeException if type is invalid
   */
  public void setType(Type t) throws BadTypeException {
    this.type = t;
  }


}
