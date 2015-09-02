//Q2: Create a SavingsAccount class
public class SavingsAccount {
/**
 * This class provides some simple services able to be accessed
 * by other classes
 */

  //Q3 SavingAccount Properties
  private int balance;
  private String name;

  //Q4 null constructors
  public SavingsAccount() {
  /** Constructor which sets initial balance to zero. */
    balance =           0;
    name = "Bank account";
  }

  public SavingsAccount(int initialBalance, String aName) {
  /** Constructor allowing an initial value to be specified. */
    balance = initialBalance;
    name    = aName;
  }

  //Q5 greet method.
  public void greet() {
  /** Provide a simple text greeting */
    System.out.println("Hello, and welcome to your Savings Account");
  }

  //Q6 add showBalance()
  public void showBalance() {
  /** Return the current balance */
    System.out.println("Current balance of " + getName() + " is: " + balance);
  }

  //Q7 add deposit() and withdraw()
  public void deposit(int howMuch) {
  /**
   * Deposit an amount.
   * @param howMuch the amount in cents
   */
    //Q8 add check for negative amounts and complain if it is.
    if (howMuch > 0) {
      System.out.println("Depositing " + howMuch + " to " + name + "...");
      balance = balance + howMuch;
    } else {System.out.println("Negative or zero amounts are not allowed!");}
  }

  public void withdraw(int howMuch) {
  /**
   * Withdraw an amount.
   * @param int the amount in cents
   */
    //Q8 add check for negative amounts and complain if it is.
    if (howMuch > 0) {
      System.out.println("Withdrawing " + howMuch + " from "+ name + "...");
      balance = balance - howMuch;
    } else {System.out.println("Negative or zero amounts are not allowed!");}
  }


  public int getBalance() {
  /** Returns the balance of a SavingsAccount as an int
   *  @return  the current balance as an int
   */
    return balance;
  }

  public String getName() {
  /** Returns the name of the SavingsAccount
   * @return the name of the Account as aa String
   */
    return name;
  }

  //Q10 Create a transfer() method [Note: not found in javadoc]
  public void transfer(int howMuch, SavingsAccount targetAccount) {
  /**
   * Method to transfer money from one account into the other:
   * @param howMuch       the amount in cents
   * @param targetAccount SavingsAccount Object to transfer money to
   * @see   SavingsAccount
   */

    //Check if targetAccount exists
    if (targetAccount == null) {
      System.out.println("Can't transfer money to a non-existing account!");
      System.exit(1);
    }

    //check if transfer ammount is not larger than initial balance
    if(howMuch <= balance) {
      withdraw(howMuch);
      targetAccount.deposit(howMuch);
      showBalance();
      targetAccount.showBalance();
    }
    else {
      System.out.println("Can't withdraw " + howMuch + " from " + name);
      showBalance();
      System.out.println();
    }

  }
}

//vim: set tabstop=2 shiftwidth=2 expandtab:
