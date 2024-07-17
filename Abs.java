import java.util.*;
abstract class Bank{
abstract void interest();
void loan(){
System.out.println("Every bank should provide a min of 2L loan");
}
}
class HDFC extends Bank{
void interest(){
System.out.println("7% interest");
}
}
class AXIS extends Bank{
void interest(){
System.out.println("6% interest");
}
}
public class Abs{
public static void main(String args[]){
AXIS obj=new AXIS();
HDFC obj1=new HDFC();
Bank obj2=new Bank();
obj.interest();
obj1.interest();
obj2.interest();
}
}

