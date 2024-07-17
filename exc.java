import java.io.*;
import java.util.*;
public class exc{
public static void main(String[] args){
   int array[]=new int[3];
   int result[]=new int[3];
   int n,d;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter dividend count:");
   n=sc.nextInt();
   System.out.println("Enter the dividends:");
   for(int i=0;i<n;i++){
	   array[i]=sc.nextInt();
   }
   System.out.println("Enter divisor:");
   d=sc.nextInt();
   try{
	   for(int i=0;i<n;i++){
		   result[i]=array[i]/d;
	       System.out.println("Result:"+result[i]);
	   }
   }
   catch(ArrayIndexOutOfBoundsException e){
	   System.out.println(e);
   }catch(ArithmeticException e){
	   System.out.println(e);
   }catch(Exception e){
	   System.out.println(e);
   }
}
}

	   