package manicrover;

import java.util.Scanner;

import manicrover.Alien;

// custom class....
class Alien {
  String planet = "x";

  public Alien(String planet) {
    this.planet = planet;
    System.out.println("i am an alien from planet " + this.planet);
  }

  public Alien() {
    System.out.println("i am an alien");
  }

  public Alien(double light_years) {
    // using f string in java.
    System.out.printf("i am an alien living %s light years away from earth", light_years);
  }
}

// class (main)
public class Constructors {
  public static void main(String[] args) {
    Alien a = new Alien();
  }
}
