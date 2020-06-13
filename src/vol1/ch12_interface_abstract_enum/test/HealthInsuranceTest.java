package vol1.ch12_interface_abstract_enum.test;

public class HealthInsuranceTest {
  public static void main(String[] args) {
    int[] salaryArray = {500, 1500, 5500, 8000};
    HealthInsurance[] insurances = new HealthInsurance[4];
    insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
    insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
    insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);
    insurances[3] = HealthInsurance.getHealthInsurance(salaryArray[3]);

    for (int i = 0; i < insurances.length; i++) {
      System.out.println(salaryArray[i] + " = " + insurances[i] + ", " + insurances[i].getRatio());
    }
  }
}
