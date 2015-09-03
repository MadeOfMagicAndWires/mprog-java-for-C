/* Need to import java.io package to use the BufferedReader and
 * InputStreamReader.
 */
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
    InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }

  //1b) add readAge() method
  /** Read int age from stdin */
  public void readAge() throws IOException {
    System.out.print("Please input your age: ");

    //1d) implement a try catch catch block
    try {
      age = Integer.valueOf(stdIn.readLine());
      //1e) Check if  0 >= age >= 150.
      if ( 0 >= age || age >= 150) {
        System.out.println("Please insert an age between 0-150 though");
        readAge();
      }
    }
    catch (NumberFormatException nf) {
      System.out.println("you can't be letters year old silly!");
      //1e) Ask again until a number is given.
      readAge();
    }
    catch (IOException io) {
      System.out.println("Whoops! Looks like something went wrong!");
      System.out.println(io.getMessage());
      System.exit(-1);
    }
  }

  public void printName () {
    System.out.println("Name: " + name);
  }

  /** Print int age to stdout */
  public void printAge() {
    System.out.println("Age: " + age);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();

    //1b) Add call to readAge() and printAge() methods
    me.readAge();
    me.printAge();

    //1c) Input letters for age? Exception Time!

  }
}



//vim: set tabstop=2 shiftwidth=2 expandtab:
