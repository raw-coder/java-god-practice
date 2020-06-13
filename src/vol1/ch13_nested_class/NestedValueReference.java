package vol1.ch13_nested_class;

public class NestedValueReference {
  public int publicInt = 0;
  protected int protectedInt = 1;
  int justInt = 2;
  private int privateInt = 3;
  static int staticInt = 4;

  static class StaticNestedClass {
    private int staticNestedInt = 99;
    public void setValue() {
      // static 변수가 아닌 경우 참조할 수 없음
//      publicInt = 10;
//      protectedInt = 11;
//      justInt = 12;
//      privateInt = 13;

      staticInt = 14;
    }
  }

  class InnerClass {
    private int innerValue = 100;
    public void setValue() {
      publicInt = 20;
      protectedInt = 21;
      justInt = 22;
      privateInt = 23;
      staticInt = 24;
    }
  }

  public void setValue() {
    EventListener listener = new EventListener() {
      @Override
      public void onClick() {
        publicInt = 30;
        protectedInt = 31;
        justInt = 32;
        privateInt = 33;
        staticInt = 34;
      }
    };
  }

  public void setValue2(int value) {
    StaticNestedClass nestedClass = new StaticNestedClass();
    nestedClass.staticNestedInt = value;
    InnerClass innerClass = new InnerClass();
    innerClass.innerValue = value;
  }

}
