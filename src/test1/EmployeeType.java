package test1;

public enum EmployeeType {
  OWNER(1, -0.95),
  MANAGER(2, 0.1),
  DESIGNER(3, 0.2),
  ARCHITECT(4, 0.3),
  DEVELOPER(5, 1.0);

  private int value;
  private double increaseRate;

  EmployeeType(int value, double increaseRate) {
    this.value = value;
    this.increaseRate = increaseRate;
  }

  public int getValue() {
    return value;
  }

  public double getIncreaseRate() {
    return increaseRate;
  }
}
