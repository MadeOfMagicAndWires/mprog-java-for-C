//Q2: Create a SavingsAccount class
public class SavingsAccout {
/*
 * This class provides some simple services able to be accessed 
 * by other classes
 */

  //Q3 SavingAccount Properties
  private int balance;

  //Q4 null constructor
  public SavingsAccount() {
  /* Constructor which sets initial balance to zero. */
    balance = 0;
  }

  public SavingsAccount(int initialBalance) {
  /* Constructor allowing an initial value to be specified. */
    balance = initialBalance;
  }

}

//vim:set tabstop=2 shiftwidth=2 expandtab
