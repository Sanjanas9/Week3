class Animal {
  String name;
  String color;
  int tailLength;
  int no_of_legs;
 
  void eat() {
    System.out.println("eating......");
  }
 
}
 
class Dog extends Animal {
  String bread;
  String type_of_dog;
 
  void bark() {
    System.out.println("barking......");
  }
 
  void displayProperties() {
    System.out.println(name + " " + color + " " + tailLength + " " + no_of_legs + " " + bread + " " + type_of_dog);
  }
}
 
class Cat extends Animal{
  String eyeColor;
  void meow(){
    System.out.println("meow......");
  }
}
 
 
public class InheritanceDemo {
  public static void main(String args[]) {
    Cat cat=new Cat();
    
  }
}