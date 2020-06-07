package vol1.ch15Annotation;

public class AnnotationSample {
  @SuppressWarnings("deprecation")
  public void useDeprecated() {
    AnnotationChild child = new AnnotationChild();
    child.noMoreUse();
  }
}
