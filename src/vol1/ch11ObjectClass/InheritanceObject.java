package vol1.ch11ObjectClass;

public class InheritanceObject {
  public static void main(String[] args) {
    InheritanceObject obj = new InheritanceObject();
    obj.toStringMethod(obj);
    obj.toStringMethod2();
    obj.equalMethod();
  }

  public void toStringMethod(InheritanceObject obj) {
    System.out.println("===toStringMethod===");

    System.out.println(obj);
    System.out.println(obj.toString());
    System.out.println("plus " + obj);
  }

  public void toStringMethod2() {
    System.out.println("===toStringMethod2===");

    System.out.println(this);
    System.out.println(toString());
    System.out.println("plus " + this);
  }

  public String toString() {
//    return "InheritanceObject Class";
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }

  public void equalMethod() {
    System.out.println("===equalMethod===");

    MemberDTO obj1 = new MemberDTO("Steve");
    MemberDTO obj2 = new MemberDTO("Steve");
//    if (obj1 == obj2) {
    if (obj1.equals(obj2)) {
      System.out.println("obj1 and obj2 are the same");
    } else {
      System.out.println("obj1 and obj2 are different");
    }
  }
}
