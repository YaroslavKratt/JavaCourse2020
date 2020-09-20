package classes;

public class ImplementInterfaceDemo implements InterfaceDemo {

  @Override
  public void methodWithoutImplementation() {

    System.out.println("Hey, I`m implemented interface method");
  }
}
