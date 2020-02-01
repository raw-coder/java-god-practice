package ch4Variables;

public class ProfilePrint {
  byte age;
  String name;
  boolean isMarried;

  public void setAge(byte age) {
    this.age = age;
  }

  public byte getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setMarried(boolean flag) {
    this.isMarried = flag;
  }

  public boolean isMarried() {
    return this.isMarried;
  }

  public static void main(String[] args) {
    ProfilePrint myProfilePrint = new ProfilePrint();
    myProfilePrint.setName("Steve");
    myProfilePrint.setAge((byte) 10);
    myProfilePrint.setMarried(true);

    System.out.println("My name is " + myProfilePrint.getName());
    System.out.println("My age is " + myProfilePrint.getAge());
    System.out.println("Marriage O / X : " + myProfilePrint.isMarried());
  }
}
