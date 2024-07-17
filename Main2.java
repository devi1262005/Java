import java.awt.*;//awt.Point
public class Main2{
	public static void main(String[] args){
		Point point1=new Point(1,1);// (x:1,y:1);
		Point point2=point1;
		point1.x=2;
		System.out.println(point2);
		System.out.println(point1);
	}
}
		
		//reference types are copied by their references
		//primitive types are copied by their values