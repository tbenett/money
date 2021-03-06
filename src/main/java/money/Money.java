package money;

class Money {
  protected final String currency;
  protected int amount;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  @Override
  public boolean equals(Object o) {
    final Money money = (Money) o;

    return amount == money.amount
        && currency.equals(money.currency);
  }

  String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}
