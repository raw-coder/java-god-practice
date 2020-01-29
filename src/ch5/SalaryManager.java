package ch5;

public class SalaryManager {
  public static void main(String[] args) {
    SalaryManager manager = new SalaryManager();
    System.out.println("monthly salary = " + manager.getMonthlySalary(20000000));
  }

  public double getMonthlySalary(int yearlySalary) {
    double monthlySalary = (double) yearlySalary / 12.0;

    double tax = calculateTax(monthlySalary);
    double pension = calculateNationalPension(monthlySalary);
    double insurance = calculateHealthInsurance(monthlySalary);
    double deduction = tax + pension + insurance;
    monthlySalary -= deduction;
    return monthlySalary;
  }

  public double calculateTax(double monthlySalary) {
    double tax = monthlySalary * 0.125;
    System.out.println("tax = " + tax);
    return tax;
  }

  public double calculateNationalPension(double monthlySalary) {
    double pension = monthlySalary * 0.081;
    System.out.println("NationalPension = " + pension);
    return pension;
  }

  public double calculateHealthInsurance(double monthlySalary) {
    double insurance = monthlySalary * 0.135;
    System.out.println("NationalPension = " + insurance);
    return insurance;
  }
}
