class Animal {

  // Properties of the class...
  public int     numberOfLegs;
  public boolean hasWings;

  // Constructor of the class...
  public Animal() {
    numberOfLegs = 4;
    hasWings = false;
  }

  // Methods of the class...
  public void talk() {
    System.out.println("Hello");
  }
}

class Bird extends Animal {

  // Properties of the class...
  public boolean canFly;

  // Constructor of the class...
  public Bird() {
    numberOfLegs = 2;
    hasWings = true;
    canFly = true;
  }

  // Methods of the class...
  public void fly() {
    System.out.println("flap flap");
  }
}

class Eagle extends Bird {

  // Properties of the class...
  private int numberOfKills;

  // Constructor of the class...
  Eagle() {
    numberOfKills = 0;
  }

  // Methods of the class...
  public void attack() {
    numberOfKills++;
  }
}

class AnimalTest {

  // The main method is the point of entry into the program...
  public static void main(String[] args) {

    Animal a = new Animal();
    System.out.println(a.numberOfLegs);
    System.out.println(a.hasWings);
    a.talk();
    //1b) Animal class doesn't have fly() method
    //a.fly();

    Bird b = new Bird();
    System.out.println(b.numberOfLegs);
    System.out.println(b.hasWings);
    System.out.println(b.canFly);
    //1b) Bird class doesn't have numberOfKills property
    //System.out.println(b.numberOfKills);
    b.talk();
    //1b) Bird class doesn't have attack() method
    //b.attack();

    //1d) numberOfLegs=2 thanks to the inherreted Bird constructor
    Eagle e = new Eagle();
    //1b) numberOfKills is set to private
    //System.out.println(e.numberOfKills);
    System.out.println(e.numberOfLegs);
    System.out.println(e.hasWings);
    e.talk();
    e.attack();
    System.out.println();

    //1e) change a to b; try to fly
    a = b;
    a.talk();
    //1e) still gives an error! the Bird object is recast as an Animal!
    //a.fly();
    System.out.println();

    //1f) change b to a; try to fly
    //But you an Animal object is not recast as a Bird!
    //In short, there's enough data to revert to a superclass,
    //But you can't "evolve" into a subclass without the missing properties.
    //b = a;
    b.talk();
    b.fly();
  }
}
//vim: set tabstop=2 shiftwidth=2 expandtab:
