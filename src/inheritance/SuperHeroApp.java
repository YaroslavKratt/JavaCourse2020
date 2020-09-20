package inheritance;

public class SuperHeroApp {

  public static void main(String[] args) {
    Thanos thanos = new Thanos("Thanos", 1000);
    Thor thor = new Thor("Thor", 1001);

    SuperHero sh = new Thor("name", 34);
    SuperHero sh2 = new Thanos("name", 34);

    sh.fight(sh);
    sh2.fight(sh);

    thor.fight(thanos);
    thanos.click(thor);
    thanos.fight(thor);

    SuperHero hulk = new SuperHero("Hulk", 800);
    thor.fight(hulk);
  }
}
