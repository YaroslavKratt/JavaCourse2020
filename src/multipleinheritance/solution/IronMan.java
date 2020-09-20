package multipleinheritance.solution;

public class IronMan implements FlyingPower, IntelligencePower {

  @Override
  public void crazyAssFly() {
    System.out.println("Just normal crazy-ass flight...");
  }

  @Override
  public void fly() {
    System.out.println("FLYYYYY");
  }

  @Override
  public void invent(String somethingToInvent) {}

  public static void main(String[] args) {
    IronMan ironMan = new IronMan();

    ironMan.crazyAssFly();
    ironMan.fly();

    IntelligencePower.saySomeThingSmart();
    System.out.println(IntelligencePower.WISE_THOUGHT);
  }
}
