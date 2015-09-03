public class LoopTest {
  // The main method is the point of entry into the program...
  public static void main(String[] args) {
	LoopTest me = new LoopTest();
	me.doStuff();
  }
  // add your code here...
  public void doStuff() {
  /** Test the various powerOf2*() methods of the LoopTest class */

    //Q2 Initial Test powerOf2*() methods.
    //Result should be 16.
    testPowerOf2(4);

    //Q3 Test PowerOf2*() with int 0;
    testPowerOf2(0);

    //Q4 Test PrintLine*() methods
    testPrintLine(4);
    testPrintLine(0);
    testPrintLine(-1);

  }

  public void testPowerOf2(int n) {
  /** Tests all the testPowerOf2*() methods at once */
    System.out.println("powerOf2A(" + n + "): " + powerOf2A(n));
    System.out.println("powerOf2B(" + n + "): " + powerOf2B(n));
    System.out.println("powerOf2C(" + n + "): " + powerOf2C(n));
    System.out.println();
  }

  public void testPrintLine(int length) {
  /** Tests all the printLine*() methods at once */
    System.out.println("Test printLine*(" + length +  ")");
    printLineA(length);
    printLineB(length);
    printLineC(length);
    System.out.println();
  }

  // These functions compute powers of two.
  public int powerOf2A(int n) {
    int counter = n;
    int result  = 1;
    while (counter != 0) {
      result = 2 * result;
      counter--;
    }
    return result;
  }

  public int powerOf2B(int n) {
    if (n == 0)
      return 1;

    int counter = n;
    int result  = 1;
    do {
      result = 2 * result;
      counter--;
    } while (counter >= 0);
    return result;
  }

  public int powerOf2C(int n) {
    int counter;
    int result;
    for (counter = n, result = 1; counter != 0; counter--) {
      result = 2 * result;
    }
    return result;
  }

  public void printLineA(int length) {
 /** Prints a row of crunches of a given length. */
    int i = length;

    while (i > 0) {
      System.out.print("#");
      i--;
    }
    System.out.println();
  }

  public void printLineB(int length) {
  /** Prints a row of crunches of a given length. */

    int i = length;
    do {
      if (i <= 0)
        break;
      System.out.print("#");
      i--;
    } while (i > 0);
    System.out.println();
  }

  public void printLineC(int length) {
  /** Prints a row of crunches of a given length. */
    for (int i=0; i<length; i++) {
      System.out.print("#");
    }
    System.out.println();
  }
}
//vim:set tabstop=2 shiftwidth=2 expandtab:
