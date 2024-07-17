import java.util.*;
public class FizzBuzz{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int k=sc.nextInt();
if(k%3==0 && k%5==0){
	System.out.println("FizzBuzz");
}
else if(k%3==0){
	System.out.println("Fizz");
}
else if(k%5==0){
	System.out.println("Buzz");
}
else{0
	System.out.println(k);
}
}
}

