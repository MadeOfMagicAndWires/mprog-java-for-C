public class Iffy {
  private int anIntProp = 42;

  public static void main(String[] args) {
    Iffy me = new Iffy();
    me.callSomeMethods();
  }

  public void callSomeMethods() {
  /** Tests the various methods of the Iffy class. */
	// add statements here to exercise the other methods ...

    //Q2 test warnIfNegative()
    warnIfNegative(0);
    warnIfNegative(5);
    warnIfNegative(-0);
    //warnIfNegative(0.5);
    //Fault 1: can't test double's
    //Fault 2: Faulty colon, which means the println() call
    //         always fires.

    //Q4 Test resetIfNegative
    resetIfNegative();
    //System.out.println(anIntProp);
    //Fault: missing braces in multi-line if-block.
    //(Also no double, so can't test fractions)

    //Q7 test isInRange()
    System.out.println(isInRange(5, 10, 1));
    System.out.println(isInRange(1, 19, 5));
    System.out.println();

    //Q8 test isInRangeIfLess()
    System.out.println(isInRangeIfLess(5, 10, 1));
    System.out.println(isInRangeIfLess(1, 19, 5));
    System.out.println();

    //Q9 test if upperBound is indeed larger than lowerBound
    isInRange(10, 1, 5);
    isInRange(10, 100, 100);
    System.out.println();

  }

  /**
   * Print out a warning if the value is negative
   * otherwise don't do anything.
   */
  public void warnIfNegative(int theValue) {
    //Q3 remove faulty colon.
    if(theValue < 0)
      System.out.println("Caution - negative value given (" + theValue + ")");

  }

  /**
   * Print out a warning if the value of anIntProp is negative
   * and also set the value to zero.
   * Otherwise don't do anything.
   */
  public void resetIfNegative() {
    //Q5 Add braces to multiline conditional
    if(anIntProp < 0) {
      System.out.println("Caution - negative value given (" + anIntProp + ")");
      anIntProp = 0;
    }
  }

  /**
   * return true if value is between upperBound and LowerBound
   * (or equal to either bound) otherwise return false.
   */
   public boolean isInRange(int value, int upperBound, int lowerBound) {
    //Q6 add "and...also" component to  conditional;
    //Q9 check if lowerbound is indeed lower than upperbound.
    if(upperBound <= lowerBound){
      System.out.println("The upper bound " + upperBound +
                         " is smaller or equal to the lower bound " +
                         lowerBound+ "!");
      return false;
    }

    if(lowerBound <= value && value <= upperBound)
        return true;
      else
        return false;

  }

   public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
     return (lowerBound <= value && value <= upperBound);
  }

}
//vim: set tabstop=2 shiftwidth=2 expandtab:
