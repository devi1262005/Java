import java.util.Scanner;
public class Main12{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);//System.out -op
	System.out.print("Age:");//println adds a new line
	byte age=sc.nextByte();
	Scanner sc1=new Scanner(System.in);
	System.out.print("Name:");
	String name=sc1.nextLine().trim();
	System.out.println("Your name:"+name);
	System.out.print("You are:"+age);
}
}
