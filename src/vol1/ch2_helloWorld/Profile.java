package vol1.ch2_helloWorld;
public class Profile {
  String name;
  int age;

  public static void main(String[] args) {
    Profile myProfile = new Profile();
    myProfile.setName("Min");
    myProfile.setAge(20);
    myProfile.printName();
    myProfile.printAge();
  }

  public void setName(String str) {
    this.name = str;
  }

  public void setAge(int val) {
    this.age = val;
  }

  public void printName() {
    System.out.println("My name is " + this.name);
  }

  public void printAge() {
    System.out.println("My age is " + this.age);
  }
}
