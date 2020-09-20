package classes;

public class Dog {
  final String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void bark() {
    System.out.println("Woof MFKR!");
  }

  public void printName() {
    System.out.println("Name: " + name);
  }

  public void printAge() {
    System.out.println("Age: " + age);
  }
}
