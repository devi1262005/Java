import java.util.*;
class MyThread extends Thread{
	private Thread t;
	private int i,j;
	MyThread(){
		for(j=7;j<=10;j++){
			System.out.println(j);
		}
	}
		 public void run(){
				 for(i=0;i<=5;i++){
					 System.out.println(i+1);
					 try{
						 Thread.sleep(1000);
					
				 }catch(InterruptedException e){
					 System.out.println(e);
				 }
				 }
		 }
			 
		 }
		 /* public void start(){
			 if(t==null){
				 t=new Thread(this);
				 t.start();
			 }
		 } */
class lab2{
	public static void main(String args[]){
		MyThread t=new MyThread();
		MyThread t2=new MyThread();
		t.start();
		t2.start();
	}
	
}
		 