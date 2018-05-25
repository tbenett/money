package money;

class Money {
  protected int amount;

  @Override
  public boolean equals(Object o) {
    final Money money = (Money) o;

    return amount == money.amount
        && getClass() == money.getClass();
  }
}
