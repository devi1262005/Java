import java.util.*;
public class Main3{
public static void main(String[] args){
	String message="     Hello World" +"!";
	String message1="  hello                "+"!!";
	boolean i=message.endsWith("!!");
	System.out.println(message);
	System.out.println("Ends with:"+i);
	System.out.println(message.length());
	System.out.println(message.indexOf("W"));
	System.out.println(message.replace("!", "*"));// target:"!", replacement:"*"
    System.out.println("Immutable:"+message);//strings are immutable
    System.out.println(message.toLowerCase());
	System.out.println(message.toUpperCase());
	System.out.println(message.trim());
	System.out.println(message1.trim());
}
}