package vol1.ch13_nested_class;

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
