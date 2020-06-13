package vol1.ch12_interface_abstract_enum;

public class OverTimeManager {
  public static void main(String[] args) {
    OverTimeManager manager = new OverTimeManager();
    int amount = manager.getOverTimeAmount(OverTimeValues.THREE_HOURS);
    System.out.println(amount);

    OverTimeValues2 value2 = OverTimeValues2.FIVE_HOURS;
    System.out.println(value2);
    System.out.println(value2.getAmount());

    OverTimeValues2 value3 = OverTimeValues2.WEEKEND_EIGHT_HOURS;
    System.out.println(value2.equals(value3));

    OverTimeValues2[] valueList = OverTimeValues2.values();
    for (OverTimeValues2 value: valueList) {
      System.out.println(value);
    }
  }

  public int getOverTimeAmount(OverTimeValues value) {
    int amount = 0;
    System.out.println(value);
    switch (value) {
      case THREE_HOURS:
        amount = 18000;
        break;
      case FIVE_HOURS:
        amount = 30000;
        break;
      case WEEKEND_FOUR_HOURS:
        amount = 40000;
        break;
      case WEEKEND_EIGHT_HOURS:
        amount = 60000;
        break;
      default:
        break;
    }
    return amount;
  }
}
