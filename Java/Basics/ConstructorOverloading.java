package manicrover;

import java.util.Scanner;
import manicrover.Alien;

class Alien {
  String planet;

  public Alien(String planet) {
    System.out.println("i am a alien from planet " + planet);
  }

  public Alien() {
    System.out.println("i am a alien");
  }

  public Alien(double light_years) {
    // using f string in java.
    System.out.printf("i am a alien living %s light years away from earth", light_years);
  }
}

public class Constructors {
  public static void main(String[] args) {
    Alien a = new Alien(1);
  }
}
