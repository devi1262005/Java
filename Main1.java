import java.util.*; //import java.util.Date;
public class Main1{
	public static void main(String[] args){
		byte age=30;
		byte x=10;
		byte y=x;
		x=20;// has no members
		System.out.println(x);
		System.out.println(y);
		Date now=new Date();
		System.out.println(now);
		//now.getTime();
	}
}