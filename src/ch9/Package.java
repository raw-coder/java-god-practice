package ch9;

import ch9.sub.Sub;

import static ch9.sub.Sub.CLASS_NAME;
import static ch9.sub.Sub.subClassStaticMethod;

public class Package {
  public static void main(String[] args) {
    System.out.println("Package Class");

    Sub sub = new Sub();
    sub.subClassMethod();

    subClassStaticMethod();
    System.out.println(CLASS_NAME);

    sub.publicMethod();
//    sub.protectedMethod();
//    sub.packagePrivateMethod();
//    sub.privateMethod();
  }
}
