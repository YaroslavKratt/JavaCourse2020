package classes;

public interface InterfaceDemo {
  public static final int CONSTANT = 1;

  void methodWithoutImplementation();

  public static void someStaticMethod() {
    System.out.println("I am method of the class, not of the object");
  }

  default void defaultMethod() {
    System.out.println("This is a default method from interface");
  }
}
