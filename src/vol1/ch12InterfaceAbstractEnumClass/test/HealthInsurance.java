package vol1.ch12InterfaceAbstractEnumClass.test;

public enum HealthInsurance {
  LEVEL_ONE(1000, 0.01),
  LEVEL_TWO(2000, 0.02),
  LEVEL_THREE(3000, 0.032),
  LEVEL_FOUR(4000, 0.045),
  LEVEL_FIVE(5000, 0.056),
  LEVEL_SIX(6000, 0.071);

  private final int maxSalary;
  private final double ratio;

  HealthInsurance(int maxSalary, double ratio) {
    this.maxSalary = maxSalary;
    this.ratio = ratio;
  }

  public double getRatio() {
    return ratio;
  }

  public int getMaxSalary() {
    return maxSalary;
  }

  public static HealthInsurance getHealthInsurance(int salary) {
    HealthInsurance[] values = HealthInsurance.values();
    HealthInsurance returnHealthInsurance = null;
    for (int i = 0; i < values.length; i++) {
      if (values[i].getMaxSalary() > salary) {
        returnHealthInsurance = values[i];
        break;
      }
      ;
    }
    if (returnHealthInsurance == null) {
      return values[values.length - 1];
    } else {
      return returnHealthInsurance;
    }
  }
}
