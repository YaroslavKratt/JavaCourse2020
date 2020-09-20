package inheritance;

public class SuperHero {

  protected String name;
  protected int power;

  SuperHero(String name, int power) {
    this.name = name;
    this.power = power;
  }

  protected void fight(SuperHero superHero) {
    System.out.println("Fighting with " + superHero.getName());

    if (power > superHero.power) {
      printWinner(name);
    } else {
      printWinner(superHero.getName());
    }
  }

  protected String getName() {
    return name;
  }

  private void printWinner(String name) {
    System.out.println(name + " WINS!");
  }

  protected SuperHero getSuperHero() {
    return this;
  }
}
