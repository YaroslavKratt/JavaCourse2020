package inheritance;

public class BadGuy extends SuperHero {

  BadGuy(String name, int power) {
    super(name, power);
  }

  public String getName() {
    return name;
  }
}
