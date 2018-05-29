package money;

class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return dollar(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}