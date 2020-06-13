package vol1.ch15_annotation;

import java.lang.reflect.Method;

public class UserAnnotationSample {
  @UserAnnotation(number = 0)
  public static void main(String[] args) {
    UserAnnotationSample sample = new UserAnnotationSample();

    sample.checkAnnotations(UserAnnotationSample.class);
  }

  @UserAnnotation(number = 1)
  public void annotationSample1() {

  }

  @UserAnnotation(number = 2, text = "second")
  public void annotationSample2() {

  }

  @UserAnnotation(number = 3, text = "third")
  public void annotationSample3() {

  }

  public void checkAnnotations(Class useClass) {
    Method[] methods = useClass.getDeclaredMethods();
    for (Method method : methods) {
      UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);
      if (annotation != null) {
        int number = annotation.number();
        String text = annotation.text();
        System.out.println(method.getName() + "() : number = " + number + ", text = " + text);
      } else {
        System.out.println(method.getName() + "() : annotation is null");
      }
    }
  }
}
