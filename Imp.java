import java.util.*;
class T implements Runnable{
public void run(){ 
System.out.println("Thread is running");
}
}
public class Imp{
public static void main(String args[]){
T obj=new T();
Thread o=new Thread(obj);
o.start();
}
}