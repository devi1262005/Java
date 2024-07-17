import java.util.*;
public class IfState{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter temperature:");
 int temp=sc.nextInt();
 if(temp>30){
	 System.out.println("It is a hot day \n Drink Plenty Water");
 }
 else if(temp>20){
	 System.out.println("It is a nice day");
 }
 else{
	 System.out.println("It is cold");
 }
}
}
