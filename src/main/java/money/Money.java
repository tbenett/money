package money;

abstract class Money {
  protected int amount;
  protected final String currency;

  abstract Money times(int multiplier);

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  @Override
  public boolean equals(Object o) {
    final Money money = (Money) o;

    return amount == money.amount
        && getClass() == money.getClass();
  }

  abstract String currency();
}
