package test1;

public class Employee {
  private String name;
  private int type;
  private long salary;

  public Employee(String name, int type, long salary) {
    this.name = name;
    this.type = type;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  public long getSalaryIncrease(Employee employee) {
    double increaseRate = 1.0;

    switch (employee.type) {
      case 1:
        increaseRate = EmployeeType.OWNER.getIncreaseRate();
        break;
      case 2:
        increaseRate = EmployeeType.MANAGER.getIncreaseRate();
        break;
      case 3:
        increaseRate = EmployeeType.DESIGNER.getIncreaseRate();
        break;
      case 4:
        increaseRate = EmployeeType.ARCHITECT.getIncreaseRate();
        break;
      case 5:
        increaseRate = EmployeeType.DEVELOPER.getIncreaseRate();
        break;
      default:
        break;
    }
    return (long) (employee.salary * increaseRate);
  }
}
