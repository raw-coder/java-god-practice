package vol1.ch15Annotation;

public class AnnotationChild extends Parent {
  @Override
  public void printName() {
    System.out.println("AnnotationChild");
  }

  @Deprecated
  public void noMoreUse() {

  }
}
