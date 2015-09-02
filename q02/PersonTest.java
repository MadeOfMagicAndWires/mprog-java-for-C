class Person {

  // Properties of the class...
  private String        name;
  public int            age;

  //Q2: Add a new Property to the Person class
  private boolean yediKnight;


  // Constructor of the class...

  //  public Person(String aName, int anAge, boolean isYediKnight) {
  //  /*
  //   * Class constructor that initializes a Person's values
  //   * String name        = their name
  //   * int age            = their age
  //   * boolean yediknight = whether they're a yedi Knight
  //  */
  //    name        = aName;
  //    age         = anAge;
  //    yediKnight  = isYediKnight;
  //
  //	talk();
  //  }


  public void talk() {
	/* function for people to introduce themselves.
	 *  Person sends their name, age, and  possible Yedi Knight status to stdout.
	 */
	System.out.println("Hi, my name's " + name);
	System.out.println("and my age is " + age + ".");

	if(yediKnight) {
	  System.out.println("(This is actually a secret, but I'm also a Master"
		  + " of the Force!)");
	}

	//Q8: Add call to commentAboutAge();
	commentAboutAge();
  }

  public void commentAboutAge() {
	/*
	 * Make a comment about someone's age
	 * Which is not very nice.
	 * Fires when someone is of the age:
	 * 5 or younger or older than 60.
	 * Otherwise just replies with "..."
	 */
	if (age < 5) {
	  System.out.println("baby");
	} else if (age == 5) {
	  System.out.println("time to start school");
	} else if (age > 60) {
	  //Q3: print old person if age > 60.
	  System.out.println("old person");
	} else {
	  System.out.println("...");
	}

	System.out.println();
  }

  public void growOlder() {
	/*Function to increase a Person's age by 1. */
	age++;
	System.out.println(name + " has leveled up! They are now " + age
		+ " years old.");
	System.out.println();
  }

  public void growOlderBy(int years) {
	age = age + years;
	System.out.println(name + " has leveled up! They are now " + age
		+ " years old.");
	System.out.println();
  }

  public void giveKnighthood() {
	/*
	 * Function to add a "Sir prefix to a Person's name,
	 * and make them a Yedi Knight.
	 */
	name       = "Sir " + name;
	yediKnight = true;
	System.out.println("Brave, Brave " + name);
	System.out.println();
  }

}

class PersonTest {

  // The main method is the point of entry into the program...
  public static void main(String[] args) {

	//Q10: "Delete" Constructor and initialized values.
	//Person ls = new Person("Luke Skywalker",34, true);
	Person ls = new Person();
	//Person sl = new Person("Simon Lane",32, false);
	Person sl = new Person();
	//Person ym = new Person("Your Mom", 99, false);
	Person ym = new Person();
	//Person lb = new Person("Little Brother", 03, true);
	Person lb = new Person();

	//Q5: It's somebody's birthday!
	//Little Brother is now one year older.
	lb.growOlder();

	//Q6:Simon Lane is now "Sir Simon Lane"!
	sl.giveKnighthood();

	//Q7: Print Luke's age directly from PersonTest.
	//System.out.println(ls.age);

	//Q9: Age Luke by 10 years for the new Star Wars movie
	ls.growOlderBy(10);
  }


}

//vim: set tabstop=2 shiftwidth=2 expandtab:
