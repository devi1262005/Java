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
public String get(String num) {
String num1 = "";
for (int k = 0, count = 1; k < num.length(); k++, count++) {
char val = num.charAt(k);
int e = val;
int w = e * count;
num1 += w;
}
return num1;j
}
}
public String set(String n)
{
String n2="";
for(l=0;l<n.length();l+=2}
{
char f=n.charAt(l);
int z=n.charAt(l+1)-'0';
for(int o=0;o<z;o++)
{
n2+=f;
}
}
return n2;
}
}
class PasswordGenerator extends Password {-
void display() {
System.out.println("Generated Password: " + str);
}
}
public class KeerthiProject2{
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
PasswordGenerator generator = new PasswordGenerator();
generator.generatePassword(name);
generator.display();
scanner.close();
Password passwordObj = new PasswordGenerator();
String AsciiName = passwordObj.get(name);
System.out.println("Ascii Value: " + AsciiName);
}
}
