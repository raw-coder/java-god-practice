package vol1.ch13NestedClass;

public class NestedSample {
  public static void main(String[] args) {
    NestedSample sample = new NestedSample();
    sample.makeStaticNestedObject();

    sample.makeInnerObject();

    sample.setButtonListener();
  }

  public void makeStaticNestedObject() {
    OuterOfStaticClass.StaticNestedClass staticNestedClass = new OuterOfStaticClass.StaticNestedClass();
    staticNestedClass.setValue(3);
    System.out.println(staticNestedClass.getValue());
  }

  public void makeInnerObject() {
    OuterOfInnerClass outer = new OuterOfInnerClass();
    OuterOfInnerClass.Inner inner = outer.new Inner();
    inner.setValue(10);
    System.out.println(inner.getValue());
  }

  public void setButtonListener() {
    MagicButton button = new MagicButton();
    button.setEventListener(new EventListener() {
      @Override
      public void onClick() {
        System.out.println("Magic Button Clicked!");
      }
    });
    button.onClickProcess();
  }
}
