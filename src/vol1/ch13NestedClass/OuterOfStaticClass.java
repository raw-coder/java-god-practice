package vol1.ch13NestedClass;

public class OuterOfStaticClass {
  static class StaticNestedClass {
    private int value = 0;

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }
  }
}
