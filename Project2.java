import java.util.Scanner;
import java.util.Random;
abstract class Password {
String str = "";
Random rand = new Random();
abstract void display();
void generatePassword(String s) {
String st = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
for (int i = 0; i < s.length(); i++) {
if (i % 2 != 0) {
str += "*";
} else {
str += st.charAt(i);
}
}
int random = rand.nextInt(1000);
str += random;
}
}
class PasswordGenerator extends Password {
void display() {
System.out.println("Generated Password: " + str);
}
}
class ASCIIConverter {
static StringBuilder convertToASCII(String word) {
StringBuilder asciiValues = new StringBuilder();
for (int i = 0; i < word.length(); i++) {
int asciiValue = (int) word.charAt(i);
asciiValues.append(asciiValue).append(" ");
}
return asciiValues;
}
}

public class KeerthiProject {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
PasswordGenerator generator = new PasswordGenerator();
generator.generatePassword(name);
generator.display();
StringBuilder asciiOutput = ASCIIConverter.convertToASCII(name);
System.out.println("ASCII values for '" + name + "': " + asciiOutput);
scanner.close();
}
}
