import java.util.*;
public class Excep{
public static void main(String args[]) throws ArithmeticException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter denominator:");
int b=sc.nextInt();
try{
if(b==0){
throw new ArithmeticException();
}
System.out.println("Result:"+(a/b));
}
catch(ArithmeticException e){
System.out.println(e);
}
finally{
System.out.println("Rest of the code");
}
}
}