package ch8;

public class StaticBlock {
  static int data = 1;

  public StaticBlock() {
    System.out.println("StaticBlock Constructor");
  }

  static {
    System.out.println("*** first static block ***");
    data = 3;
  }

  static {
    System.out.println("*** second static block ***");
    data = 5;
  }

  public static int getData() {
    return data;
  }
}
