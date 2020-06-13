package vol1.ch14_exception;

public class MyException extends Exception {
  public MyException() {
    super();
  }

  public MyException(String message) {
    super(message);
  }
}
