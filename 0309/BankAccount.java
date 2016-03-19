public class BankAccount {

  private int amount;

  public BankAccount() {
    amount = 0;
  }

  public void deposit(int money) {
    int t;
    if (money < 0) {
      throw new IllegalArgumentException(
      "Can't deposit negative money values.");
    }
    t = amount + money;
    if (t < 0) {
      throw new IllegalArgumentException(
      "You make too much money.");
    }
      amount = t;
    }

  public int getBalance() {
    return amount;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }
    BankAccount otherBankAccount = (BankAccount) obj;
    return otherBankAccount.getBalance() == this.amount;
  }
}
