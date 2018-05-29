package money;

class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return franc(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}
