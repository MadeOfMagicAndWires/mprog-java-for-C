class ArrayTest {

  public static void main(String[] args) {
    ArrayTest x = new ArrayTest();
    x.doStuff();
  }

  public void doStuff() {

    // creates the array fred of ten integers.
    int[] fred = new int[10];

    // sets the values of the fred array
    for (int i=0; i<10; i++) {
      fred[i] = i;
    }

    // prints the values of the fred array
    for (int i=0; i<10; i++) {
      System.out.println(fred[i]);
    }
    System.out.println();

    //1b) Create double[] nums and c) initialize it.
    double[] nums = new double[10];
    for (int i=0; i < nums.length; i++){
      nums[i] = 1 + (i/10.0);
    }

    //1d) printout array
    System.out.println("Printing out nums[]");
    for(int i=0;i<nums.length;i++)
    {
      System.out.println(nums[i]);
    }
    System.out.println();

    //1e) print out array using ArrayPrint.printArray();
    System.out.println("Printing out nums[] using ArrayPrint.printArray()");
    ArrayPrint.printArray(nums);
    System.out.println();

    //1f) print out array using ArrayTest.printArray()
    System.out.println("Printing out nums[] using ArrayTest.printArray()");
    printArray(nums);

  }

  //1f) create own printArray method()
  static public void printArray(double[] array) {
  /**
   * Print out each member of an array of doubles
   * @param array an array of doubles
   */
    for(int i=0;i<array.length;i++)
    {
      System.out.println(array[i]);
    }
    System.out.println();
  }

}
//vim: set tabstop=2 shiftwidth=2 expandtab:
