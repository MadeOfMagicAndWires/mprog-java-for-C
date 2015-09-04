/**
 * A class to test a faulty BadRandom.class
 *
 * @author  Joost Bremmer
 * @version 0.1
 * @since   2015
 */
public class BRTest {

  //2c) BRTest's Properties
  private int          calls;
  private int successfulCalls;
  private int  totalReturned;

//2d) add int[] excepCounts and
  //add constants for all exceptions,
  //linking them to an array index.
  private static final int ARITHMETIC     = 0;
  private static final int NULL_POINTER   = 1;
  private static final int ARRAY_INDEX    = 2;
  private static final int CLASS          = 3;
  private static final int NEGATIVE_ARRAY = 4;
  private static final int OTHER          = 5;
  private int[] excepCalls;

  /**
   * BRTest Constructor which initializes all values to 0.
   */
  public BRTest() {
    calls          = 0;
    successfulCalls = 0;
    totalReturned  = 0;
    excepCalls = new int[6];

  }

  //2e) create callIt() method
  /**
   * Keeps track of calls to <code>BadRandom.randVal</code>
   * @see BadRandom
   */
  public void callIt() {
    calls++;
    try {
      int rando = BadRandom.randVal();
      successfulCalls++;
      totalReturned += rando;
    }
    catch (Exception e) {
      String msg = e.getMessage();
      System.out.println("Caught Exception: " + msg);

      if (msg.contains("Arithmetic"))
        excepCalls[ARITHMETIC]++;
      else if (msg.contains("NullPointer"))
        excepCalls[NULL_POINTER] += 1;
      else if (msg.contains("ArrayIndex"))
        excepCalls[ARRAY_INDEX]++;
      else if (msg.contains("Class"))
        excepCalls[CLASS]++;
      else if (msg.contains("NegativeArray"))
        excepCalls[NEGATIVE_ARRAY]++;
      else
        excepCalls[OTHER]++;
    }
  }

  //2f) create resetCounts()
  /**
   * Resets all of BRTest's properties back to zero
   * @see BRTest
   */
  public void resetCounts() {
    calls = 0;
    successfulCalls = 0;
    totalReturned = 0;
    excepCalls = new int[6];
  }

  //2g) create nRandInts()
  /**
   * Call {@link #callIt()} multiple times
   * @param n amount of times to repeat the call.
   *          Must be larger than 0
   */
  public void nRandInts(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("Can't call a method " +
                                         "less than 0 times!");
    }

    while (successfulCalls < n)
    {
      callIt();
    };
    System.out.println();
    System.out.println("The results are in!");
    System.out.println();
    writeData();
    resetCounts();
  }

  //2h) Create writeData()
  /**
   * Write the results of {@link nRandInts} to stdout.
   *
   */
  public void writeData() {
    System.out.println("Total amount of calls: "  + calls);
    System.out.println("Successful Calls: " + successfulCalls);
    System.out.println("Total value returned: "   + totalReturned);
    System.out.println("-----------------------------------------------------");
    for (int i=0; i < excepCalls.length; i++) {
      System.out.print("Percentage ");

      String errorName;
      switch (i) {
        case ARITHMETIC:
          errorName = "Arithmetic Exceptions:     ";
          break;
        case NULL_POINTER:
          errorName = "Null Pointer Exceptions:   ";
          break;
        case ARRAY_INDEX:
          errorName = "Array Index Exceptions:    ";
          break;
        case CLASS:
          errorName = "Class Cast Exceptions:     ";
          break;
        case NEGATIVE_ARRAY:
          errorName = "Negative Array Exceptions: ";
          break;
        default:
          errorName = "Other Exceptions:          ";
          break;
      }

      System.out.print(errorName);
      System.out.print(((excepCalls[i]/(double) calls)*100) + " %");
      System.out.print("\n");
    }
    System.out.println("-----------------------------------------------------");
    System.out.println("Percentage of successful calls: " +
                       ((successfulCalls/(double) calls)*100) + " %");
    System.out.println();
  }

  /**
   * standard main method; executes on running java
   * @param args String of arguments that are passed from
   *             command-line.
   */
  public static void main(String[] args) {
    //2h) test BRTest methods.
    BRTest me = new BRTest();
    me.resetCounts();
    me.nRandInts(30);
    //These are already called by randInts()
    //me.writeData();
    //me.resetCounts()
  }
}
//vim: set tabstop=2 shiftwidth=2 expandtab
