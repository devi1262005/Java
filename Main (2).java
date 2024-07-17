import java.util.*;
public class Main{
	public static void main(String[] args) {
		byte age=30;
		age=35;
		int myAge=36;
		int herAge=myAge;
		long viewsCount=3_123_456_789L;
		float price=10.99F;
		char letter='A';
		final float PI=3.14F;//constant=final
		//PI=1F; // error: cannot assign a value to final variable PI
		System.out.println(PI);
		boolean isEligible=false;
		System.out.println(isEligible);
		System.out.println(letter); 
		System.out.println(price);
		System.out.println(viewsCount);
		System.out.println(herAge);
		System.out.println(age);
    System.out.println("Hello World");
}
}