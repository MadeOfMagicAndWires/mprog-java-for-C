class CartoonCharacter {

  // Properties of the class...
  private String name;
  //Q6 Set favouriteColour to public
	public String  favouriteColour;
	private int    favouriteNumber;
	//Q7 Create new static int count
	public static int count;
	//Q8 remove static from int count
	//public int count;


  // Constructor of the class...
  public CartoonCharacter(String aName, String aColour, int aNumber) {
		name            = aName;
		favouriteColour = aColour;
		favouriteNumber = aNumber;
		//Increment static count int
		count++;
  }

  // Methods of the class...
  public void displayMe() {
		System.out.println("Hello, my name is " + name);
		System.out.println("my favourite colour is " + favouriteColour);
		System.out.println("and my favourite number is " + favouriteNumber);
		//Add newline
		System.out.println();
  }
}
//vim: set tabstop=2 shiftwidth=2 expandtab:
