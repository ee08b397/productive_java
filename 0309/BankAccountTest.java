import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {  

  private BankAccount account;

  public BankAccountTest() {
//    System.out.println("Constructor");
  }

  @Before
  public void setUp() {
    account = new BankAccount();
//    System.out.println("start");
  }

  @After
  public void tearDown() {
//    System.out.println("tear");
  }

  @Test
  public void testGetBalance() {
    assertEquals(0, account.getBalance());
  }

  @Test
  public void testDeposit() {
    account.deposit(10000);
    assertEquals(10000, account.getBalance());
  }

  // equals to try {} catch (IllegalArgumentException ignored) {
  @Test(expected=IllegalArgumentException.class)
  public void testDeposit_negative() {
    account.deposit(-1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testDeposit_overflow() {
    account.deposit(Integer.MAX_VALUE);
    account.deposit(1);
  }

  @Test
  public void testEquals() {
    BankAccount account2 = new BankAccount();
    assertEquals(account2, account);
    assertFalse(account2.equals(null));
    assertFalse(account2.equals(""));
    assertNotEquals(account2, "");
    account.deposit(100);
    assertFalse(account2.equals(account));
  }
}
