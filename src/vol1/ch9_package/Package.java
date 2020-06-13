package vol1.ch9_package;

import vol1.ch9_package.sub.Sub;

import static vol1.ch9_package.sub.Sub.CLASS_NAME;
import static vol1.ch9_package.sub.Sub.subClassStaticMethod;

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
