package vol1.ch10_inheritance;

public class Child extends Parent {
  public Child() {
    System.out.println("Child() Constructor");
  }

  public Child(String name) {
    System.out.println("Child(String) Constructor");
  }

  public void printName() {
    System.out.println("printName() - Child");
  }

  public void printAge() {
    System.out.println("printAge() - 18 month");
  }
}
