package inheritance;

import java.util.Random;

public class Thanos extends BadGuy {

  Thanos(String name, int power) {
    super(name, power);
  }

  public void click(SuperHero superHero) {
    Random random = new Random();

    if (random.nextBoolean()) {
      System.out.println(superHero.getName() + " is still alive!");
    } else {
      System.out.println(superHero.getName() + " is dead...");
    }
  }
}
