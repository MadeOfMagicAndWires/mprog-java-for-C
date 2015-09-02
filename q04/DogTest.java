class Flea {

  // Properties of the class...
  private String name;

  // Constructor of the class...
  public Flea(String aName) {
	name = aName;
  }

	public String getName() {
		return name;
	}

  // Methods of the class...
  public String toString() {
	return "I am a flea called " + name + ".\n";
  }

}

class Dog {

  // Properties of the class...
  private String name;
  private int    age;
  //changed Flea to public because I am lazy
	public Flea   dogsFlea;

  // Constructor of the class...
  public Dog(String aName, int anAge, Flea aFlea) {
	name     = aName;
	age      = anAge;
	dogsFlea = aFlea;
  }

	public String toString() {
  /* Returns a String containing all the Dog's info */
		return "I am a dog called " + name + ",\n" +
           "my age is: " + age + ",\n" +
           "and my flea is called " + dogsFlea.getName() + "\n\n";
	}

	public String getName() {
		return name;
	}


}

//Q5 Create a DogOwners Class and create some DogOwners
class DogOwner {
/* DogOwner Class
 * Has Three properties:
 * String    name: a DogOwner's name
 * int        age: a DogOwner's age
 * Dog  ownersDog: a Dog Object, containing the owners Dog
 */

	private String   name;
	private int    salary;
	public Dog ownersDog;

	public DogOwner(String aName, int aSalary, Dog aDog) {
  /* DogOwner Constructor
   * Requires three parameters, each refering to the DogOwner'
   * properties:
   * String    aName: DogOwner's name
   * int     aSalary: DogOwner's age
   * Dog   ownersDog: DogOwner's Dog, which refers to a Dog Object
   */
    name =     aName;
    salary  =     aSalary;
    ownersDog = aDog;
	}

	public DogOwner(String aName) {
	/* DogOwner's Second Constructor
   * Requires only one  parameter, the DogOwner's name.
   * Sets all other values to 0 or null.
   * String    aName: DogOwner's name
   */
		name =         aName;
		salary  =          0;
		ownersDog =     null;
	}

	public String toString() {
	/* Returns a String containing all the DogOwners info. */

		return "Hi, my name is "   + name + ",\n" +
           "My salary is: "       +  salary + ",\n" +
           "My dog's name is " + ownersDog.getName() + ",\n" +
           "And he has a flea called " + ownersDog.dogsFlea.getName() + ".\n\n";
	}
}

class DogTest {

  // The main method is the point of entry into the program...
  public static void main(String[] args) {

	//Q2 Create some Fleas
	Flea p = new Flea("Pop");
	Flea s = new Flea("Squeak");
	Flea z = new Flea("Zip");

	//Test Fleas
	System.out.println(p.toString() + s.toString() + z.toString());

	//Q3 Create some Dogs, containing Fleas.
	Dog  f = new Dog("Fido",  1, z);
	Dog  j = new Dog("Jumbo", 2, s);
	Dog  r = new Dog("Rex"  , 3, p);

	//Q4 Test Dogs with their toString() method
	System.out.println(f.toString() + j.toString() + r.toString());

	//Q6 create some DogOwners
	DogOwner a = new DogOwner("Angus",   1000, r);
	DogOwner b = new DogOwner("Brian",   2000, j);
	DogOwner c = new DogOwner("Charles", 3000, f);

	//Q7 Test DogOwners with their toString() method
	System.out.println(a.toString() + b.toString() + c.toString());

	//Q8 What is the output of a.ownersDog.dogsFlea.toString()?
	System.out.println(a.ownersDog.dogsFlea.toString());

  }

}

//vim: set tabstop=2 shiftwidth=2 expandtab:
