class Human {

  // Properties of the class...
  String name;

  // Constructor of the class...
  public Human(String aName) {
	name = aName;
  }

  // Methods of the class...
  public String toString() {
	return "I am a human and my name is " + name;
  }
}

class ArrayTest2 {

  public static void main(String[] args) {
    ArrayTest2 x = new ArrayTest2();
    x.doStuff();
  }

  public void doStuff() {

    //2b) Create array threesome[]
    Human threesome[] = new Human[3];

    //2c) Initialize the threesome
    threesome[0] = new Human("Angus");
    threesome[1] = new Human("Brian");
    threesome[2] = new Human("Charles");

    //2d) print out each Human's name
    System.out.println("Printing out threesome[]:");
    for(int i=0;i<threesome.length;i++) {
      System.out.println(threesome[i].toString());
    }
    System.out.println();

    //2f) print out each Human's name using ArrayTest2.printArray()
    System.out.println("Printing out threesome[]" +
                       "using ArrayTest2.printArray():");
    printArray(threesome);

  }

  //2e) Create a printArray method for Humans
  static public void printArray(Human[] array) {
  /**
   * Print out each item from an array of Humans
   * @param array an array of Human Objects
   */

    for(int i=0; i < array.length; i++) {
      System.out.println(array[i].toString());
    }
    System.out.println();
  }
}
//vim: set tabstop=2 shiftwidth=2 expandtab:
