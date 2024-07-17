import java.util.Scanner;

abstract class ASCIIValue {
abstract StringBuilder processASCII(String word);
}
public class Project2 extends ASCIIValue {
StringBuilder processASCII(String word) {
StringBuilder asciiValues = new StringBuilder();
int multiplier = word.length();
for (int i = 0; i < word.length(); i++) {
int asciiValue = (int) word.charAt(i);
asciiValues.append(asciiValue * multiplier);
}
return asciiValues;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = scanner.nextLine();
scanner.close();
Project2 project = new Project2();
StringBuilder processedASCII = project.processASCII(word);
System.out.println("Processed ASCII values for '" + word + "': " + processedASCII.toString());
}
}

