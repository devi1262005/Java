import java.util.*;
interface Inter1{
public void run();
}
class Class1 implements Inter1{
public void run(){
System.out.println("Runs with the help of interface");
}
}
public class Inter{
public static void main(String args[]){
Class1 obj=new Class1();
obj.run();
}
}