package classes;

public class Main {

  public static void main(String[] args) {
    //    Dog puppy = new Dog("Bruce", 1);
    //
    //    puppy.bark();
    //    puppy.printAge();
    //    puppy.printName();

    InterfaceDemo.someStaticMethod();

    ImplementInterfaceDemo interfaceDemo = new ImplementInterfaceDemo();
    System.out.println("===============");

    interfaceDemo.methodWithoutImplementation();
    System.out.println("===============");

    interfaceDemo.defaultMethod();

    System.out.println("===============");

    System.out.println(ImplementInterfaceDemo.CONSTANT);
  }
}
