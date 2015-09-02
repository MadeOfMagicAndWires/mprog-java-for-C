class Citizen {

  // Properties of the class...
  private String name;
  private int    salary;
  private int    savings;
  private int    loan;

  // Constructor of the class...
  public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
	name    = aName;
	salary  = aSalary;
	savings = aSavings;
	loan    = aLoan;
  }

	public Citizen(String aName) {
	/* Second constructor of the class Citizen.
   * Required parameters:
   *   String aName: The name of the Citizen
   * Sets all other values to 0
   */
		name    = aName;
		salary  = 0;
		savings = 0;
		loan    = 0;
	}


  // Methods of the class...
  public int getSalary() {
		return salary;
  }

	public void setSalary(int aSalary) {
		salary = aSalary;
  }

	public void salaryRise(int amount) {
	/* Method to raise a Citizen's salary
   * Requires one parameter:
   * int amount: the amout to raise a Citizen's salary by
   */
		salary = salary + amount;
	}

	public int netWorth() {
	/* Method to calculate a Citizen's net worth.
   * returns net worth as an int
   */
		return (savings - loan);
  }

	public String toString() {
	/* Returns a Citizen's information in form of a String */
		String info =  name + "'s salary is: " + salary +"\n" +
                   "They have " + savings + " in savings";
									 
		if(loan > 0) { info = info + ",\nand " + loan + " in loans.\n";}
		
		return info;
	}
}

class CitizenTest {

  // The main method is the point of entry into the program...
  public static void main(String[] args) {

	Citizen e = new Citizen("Ernie", 50000, 2000,   0);
	Citizen b = new Citizen("Bert", 100000,10000,5000);

	//Q2: Raise Ernie's Salary by $10000
	e.salaryRise(10000);
	System.out.println("Ernie's salary is: " + e.getSalary());

	//Q3: Calculate Ernie's Net worth
	System.out.println("Ernie's net worth is: " + e.netWorth());

	//Q4: Remove System.out.println().
	//The method fires normally, but it is not saved or added to a variable.
	e.getSalary();

	System.out.println();
	//Q5: Print Bert's information to stdout using toString()
 	System.out.println(b.toString());	

	//Q6: Create a new Cititzen "Fred" using a second constructor
	Citizen f = new Citizen("Fred");
	System.out.println(f.toString());
	
	}
}
//vim: set tabstop=2 shiftwidth=2 expandtab
