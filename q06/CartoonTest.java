class FredFlintstone {

  // Properties of the class...
  static String name            = "Fred Flintstone";
  static String favouriteColour = "blue";
  static int    favouriteNumber = 42;

  // Methods of the class...
  static void displayMe() {
    System.out.println("Hello, my name is " + name);
    System.out.println("my favourite colour is " + favouriteColour);
    System.out.println("and my favourite number is " + favouriteNumber);
  }
}

class WilmaFlintstone {

  // Properties of the class...
  static String name            = "Wilma Flintstone";
  static String favouriteColour = "red";
  static int    favouriteNumber = 63;

  // Methods of the class...
  static void displayMe() {
    System.out.println("Hello, my name is " + name);
    System.out.println("my favourite colour is " + favouriteColour);
    System.out.println("and my favourite number is " + favouriteNumber);
  }
}

class BarneyRubble {

  // Properties of the class...
  static String name            = "Barney Rubble";
  static String favouriteColour = "yellow";
  static int    favouriteNumber = 2;

  // Methods of the class...
  static void displayMe() {
    System.out.println("Hello, my name is " + name);
    System.out.println("my favourite colour is " + favouriteColour);
    System.out.println("and my favourite number is " + favouriteNumber);
  }
}

class CartoonTest {

  // The main method is the point of entry into the program...
  public static void main(String[] args) {

    //Q2 Call Fred Flintstones displayMe method();
    //FredFlintstone.displayMe();

    //Q3 Print out Barney's favourite number without displayMe()
    //System.out.println(BarneyRubble.favouriteNumber);

    //Q4 Create three CartoonCharacter's called Fred, Wilma and Barney
    CartoonCharacter b = new CartoonCharacter("Barney Rubble", "yellow",  2);
    CartoonCharacter f = new CartoonCharacter("Fred Flintstone", "blue", 42);
    CartoonCharacter w = new CartoonCharacter("Wilma Flintstone", "red", 63);

    //Q5 call displayMe() on all new CartoonCharacters
    b.displayMe();
    f.displayMe();
    w.displayMe();

    //Q6 print Barney's favourite colour
    System.out.println(b.favouriteColour);

    //Q7 print amount of CartoonCharacter Objects created.
    System.out.println();
    System.out.println("The amount of CartoonCharacters created: " +
                       CartoonCharacter.count);

    //Q8 print out pi to stdout
    System.out.println("the value of PI is: " + Math.PI);
  }
}

//vim: set tabstop=2 shiftwidth=2 expandtab:
