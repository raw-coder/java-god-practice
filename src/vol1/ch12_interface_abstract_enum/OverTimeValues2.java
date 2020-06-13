package vol1.ch12_interface_abstract_enum;

public enum OverTimeValues2 {
  THREE_HOURS(18000),
  FIVE_HOURS(30000),
  WEEKEND_FOUR_HOURS(40000),
  WEEKEND_EIGHT_HOURS(60000);

  private final int amount;

  OverTimeValues2(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
