package test1;

public class CalculateSalary {
  public static void main(String[] args) {
    CalculateSalary calculateSalary = new CalculateSalary();
    calculateSalary.calculateSalaries();
  }

  public void calculateSalaries() {
    Employee[] employees = new Employee[5];
    employees[0] = new Employee("Lee", 1, 1000000000);
    employees[1] = new Employee("Kim", 2, 100000000);
    employees[2] = new Employee("Hwang", 3, 70000000);
    employees[3] = new Employee("Park", 4, 80000000);
    employees[4] = new Employee("Steve", 5, 60000000);

    for (Employee employee : employees) {
      double salaryIncrease = employee.getSalaryIncrease(employee);
      double newSalary = employee.getSalary() + salaryIncrease;
      System.out.println(employee.getName() + " = " + newSalary);
    }
  }
}
