/**
 * 2b) Spaceship superclass to fight the Star Wars with.
 *
 * <p>
 * This class is used as an representation of a generic spaceship
 * It has shield and weapon capabilities with which it can shoot and get hit.
 *
 * It's shield capacity is represented by a protected int "shields".
 * It's firing power is represented by a protected int "weapon".
 * It's current status (dead/alive) is respresented by a boolean "dead".
 * </p>
 *
 * @author  Joost Bremmer
 * @version 1.0
 * @since   2015
 */
abstract class SpaceShip {

  //2c) Properties of the class...
  protected int     shields;
  protected int     weapon;
  protected boolean dead;

  //2d) Methods of the class...

  /**
   * Constructor for the SpaceShip class
   * Sets weapon and shield capacity to a generic 100
   * Sets current status to false
   * @see SpaceShip
   */
  public SpaceShip() {
    shields = 100;
    weapon  = 100;
    dead    = false;
  }

  /** Returns the weapon power of the SpaceShip as an int */
  public int getWeapon() {
    return weapon;
  }

  /** Returns whether the SpaceShip is dead or not */
  public boolean isDead() {
    return dead;
  }

  /**
   * Deals damage to the spaceship;
   * if it is hit with more damage than there's shield
   * capacity left, the ship will die.
   * @param damage amount of damage being dealt, as an int.
   * */
  public void hit(int damage) {
    shields = shields - damage;
    if (shields < 0) {
      System.out.println("BOOM!!!");
      dead = true;
    }
  }
}
//2e) extend subclasses
/**
 * X-Wing subclass of SpaceShip
 *
 * <p>
 * It has better shields but less firepower
 * than other ships.
 */
class XWing extends SpaceShip {

  /**
   * Constructor of the XWing subclass
   * Sets shields to 1000
   * Sets weapon  to 10
   * @see SpaceShip#Constructor
   */
  public XWing() {
    shields = 1000;
    weapon  = 10;
  }

}
//2e) extend subclasses
/**
 * Tie fighter subclass of SpaceShip
 *
 * <p>
 * It has subpar shields but better firepower
 * than other ships.
 */
class Tie extends SpaceShip {

  /**
   * Constructor of the TieFighter subclass
   * Sets shields to 500
   * Sets weapon  to 20
   * @see SpaceShip#Constructor
   */
   public Tie() {
    shields = 500;
    weapon  = 20;
  }
}

class StarWars {

  private void duel(XWing x, Tie t) {

    for (;;) {
      x.hit(t.getWeapon());
      if (x.isDead()) {
        System.out.println("X-Wing is dead");
        break;
      }
      t.hit(x.getWeapon());
      if (t.isDead()) {
        System.out.println("Tie fighter is dead");
        break;
      }
    }

  }

  private void battle(XWing[] good, Tie[] evil) {

    int g = 0;
    int e = 0;
    int goodDeaths = 0;
    int evilDeaths = 0;

    while (g < good.length && e < evil.length) {
      System.out.println("battling X-Wing #" + g + " versus Tie Fighter #" + e);
      duel(good[g],evil[e]);
      if (good[g].isDead()) {
        g++;
        goodDeaths++;
      }

      if (evil[e].isDead()) {
        e++;
        evilDeaths++;
      }
    }

    int finalGood = good.length - goodDeaths;
    int finalEvil = evil.length - evilDeaths;

    System.out.println();
    System.out.println("Battle Report:\t\tX-Wings\t\tTie Fighters");
    System.out.println("------------------------------------------------------");
    System.out.println();
    System.out.println("Initial ships:\t\t" + good.length + "\t\t" + evil.length);
    System.out.println();
    System.out.println("Killed ships:\t\t"  + goodDeaths  + "\t\t" + evilDeaths);
    System.out.println();
    System.out.println("Final ships:\t\t"   + finalGood   + "\t\t" + finalEvil);
    System.out.println();
    if (finalGood > finalEvil) {
      System.out.println("The rebel alliance is victorious!");
    }
    else {
      System.out.println("The dark side has conquered!");
    }
    System.out.println();
  }

  public void doStuff() {

    // defines the goodies array
    XWing[] goodies = new XWing[3];

    // initialises the elements of the goodies array
    for (int i=0; i<goodies.length; i++) {
      goodies[i] = new XWing();
    }

    // defines the baddies array
    Tie[] baddies = new Tie[3];

    // initialises the elements of the baddies array
    for (int i=0; i<baddies.length; i++) {
      baddies[i] = new Tie();
    }

    battle(goodies,baddies);

    //2g) Try to make a new instance of an abstract class
    //Spaceship milleniumFalcon = new SpaceShip();

  }

  // The main method is the point of entry into the program...
  public static void main(String[] args) {
    StarWars me = new StarWars();
    me.doStuff();
  }

}

//vim: set tabstop=2 shiftwidth=2 expandtab:
