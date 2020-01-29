package ch6;

public class InterestManager {
  public static void main(String[] args) {
    InterestManager manager = new InterestManager();

    for (int i = 1; i <= 365; i++) {
      System.out.println("day = " + i + ", amount =" + manager.calculateAmount(i, 1000000));
    }

    for (int i = 1; i <= 365; i += 10) {
      System.out.println("day = " + i + ", amount =" + manager.calculateAmount(i, 1000000));
    }
  }

  public double getInterestRate(int day) {
    double rate;
    if (day >= 365) {
      rate = 0.056;
    } else if (day > 180) {
      rate = 0.02;
    } else if (day > 90) {
      rate = 0.01;
    } else {
      rate = 0.005;
    }
    return rate;
  }

  public double calculateAmount(int day, long amount) {
    double calculatedAmount = amount + amount * this.getInterestRate(day);
    return calculatedAmount;
  }
}
