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
class Bird extends Animal {
public void fly() {
System.out.println("Bird is flying.");
}
}
class Bat extends Mammal implements Flyable {
public void fly() {
System.out.println("Bat is flying.");
}
}
interface Flyable {
void fly();
}
public class Hybrid {
public static void main(String[] args) {
Bat bat = new Bat();
bat.eat(); 
bat.run(); 
bat.fly();
}
}
