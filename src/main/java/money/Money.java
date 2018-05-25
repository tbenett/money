package money;

abstract class Money {
  protected int amount;

  abstract Money times(int multiplier);

  static Money dollar(int amount) {
    return new Dollar(amount);
  }

  static Money franc(int amount) {
    return new Franc(amount);
  }

  @Override
  public boolean equals(Object o) {
    final Money money = (Money) o;

    return amount == money.amount
        && getClass() == money.getClass();
  }
}
