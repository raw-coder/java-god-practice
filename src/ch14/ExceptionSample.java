package ch14;

public class ExceptionSample {
  public static void main(String[] args) {
    ExceptionSample sample = new ExceptionSample();
    sample.arrayOutOfBound();
    sample.multiCatch();
    sample.throwable();

    try {
      sample.throwException(15);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      sample.multiThrow();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      sample.throwException2(13);
    } catch (MyException e) {
      e.printStackTrace();
    }
  }

  public void arrayOutOfBound() {
    int[] intArray = null;
    try {
      intArray = new int[5];
      System.out.println(intArray[5]);
    } catch (Exception e) {
      System.out.println("Exception! - array length = " + intArray.length);
    } finally {
      System.out.println("This is finally!");
    }
    System.out.println("This code should be executed!");
  }

  public void multiCatch() {
    System.out.println("=== multiCatch ===");
    int[] intArray = null;
    try {
      intArray = new int[5];
      System.out.println(intArray[5]);
    } catch (NullPointerException e) {
      System.out.println("NullPointerException occurred!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException occurred");
    } catch (Exception e) {
      System.out.println("Exception! - array length = " + intArray.length);
    } finally {
      System.out.println("This is finally!");
    }
    System.out.println("This code should be executed!");
  }

  public void throwable() {
    System.out.println("=== throwable ===");

    int[] intArray = new int[5];
    try {
      intArray = null;
      System.out.println(intArray[5]);
    } catch (Throwable t) {
      System.out.println(t.getMessage());
      System.out.println(t.toString());
      t.printStackTrace();
    }
  }

  public void throwException(int number) throws Exception {
    System.out.println("=== throwException ===");
    if (number > 12) {
      throw new Exception("Number is over than 12!!");
    }
  }

  public void multiThrow() throws NullPointerException, ArrayIndexOutOfBoundsException {
    System.out.println("=== multiThrow ===");

    int[] intArray = new int[5];
    intArray = null;
    System.out.println(intArray[5]);
  }

  public void throwException2(int number) throws MyException {
    System.out.println("=== throwException2 ===");

    try {
      if (number > 12) {
        throw new MyException("Number is over than 12!!!");
      }
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}
