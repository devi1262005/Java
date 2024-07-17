class Animal {
public void eat() {
System.out.println("Animal is eating.");
}
}
class Mammal extends Animal {
public void run() {
System.out.println("Mammal is running.");
}
}
class Dog extends Mammal {
public void bark() {
System.out.println("Dog is barking.");
}
}
public class MulInh{
public static void main(String[] args) {
Dog dog = new Dog();
dog.eat(); 
dog.run(); 
dog.bark();
}
}
