package vol1.ch14_exception.test;

public class Calculator {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.printDivide(1, 2);
    cal.printDivide(1, 0);
  }

  public void printDivide(double d1, double d2) {
    try {
      if (d2 == 0.0) {
        throw new Exception("Second value can not be Zero!");
      }
      double result = d1 / d2;
      System.out.println(result);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
