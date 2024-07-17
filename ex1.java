import java.util.*;
class Exam implements Runnable{
	String msg;
    Exam(String m){
msg=m;
	}
public void run(){
for(;;){
System.out.println(msg);
}
}
}
class ex1{
public static void main(String[] args){
Exam t1=new Exam("Hello");
Thread s=new Thread(t1);
s.start();
}
}	
		