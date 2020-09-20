package multipleinheritance.solution;

public interface FlyingPower {

  void crazyAssFly();

  default void fly() {
    System.out.println(" default flying");
  }
}
