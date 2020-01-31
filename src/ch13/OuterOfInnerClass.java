package ch13;

public class OuterOfInnerClass {
  class Inner {
    private int value;

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }
  }
}
