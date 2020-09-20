package inheritance;

public class Thor extends SuperHero {

  Thor(String name, int power) {
    super(name, power);
  }

  @Override
  protected void fight(SuperHero superHero) {
    System.out.println("Strike with a hammer!");
    super.fight(superHero);
  }

  int fight(SuperHero superHero, int power) {

    return 0;
  }

  @Override
  protected SuperHero getSuperHero() {
    SuperHero s = super.getSuperHero();

    return s;
  }
}
