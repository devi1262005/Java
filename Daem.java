import java.util.*;
class T extends Thread{
public void run(){
if (Thread.currentThread().isDaemon()){
System.out.println("Daemon running");
}
else{
System.out.println("Thread running");
}
}
}
public class Daem{
public static void main(String args[]){
T.obj.new T();
T. jwe bobj2.new T();
T.obj3.new T();
obj.setDaemon(true);
obj.start();
obj2.start();
obj3.start();
}
}