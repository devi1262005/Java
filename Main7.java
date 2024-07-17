import java.util.*;
public class Main7{
public static void main(String[] args){
	double result=10/3;
	System.out.println(result);//3.0
	double result1=(double)10/(double)3;
	System.out.println(result1);//3.3333333333333335
	int x=5;
	x++;//6
	System.out.println("inc");
	int y=x++;//y=6 then becomes 7
	int z=++x;//7+1=8
	int a=5;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println("dec");
	a--;//4
	int b=a--;//b=4 then becomes 3
	int c=--a;//3-1=2
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("D");
	int d=8;
	d+=2;
	System.out.println(d);
	d-=2;
	System.out.println(d);
	d*=2;
	System.out.println(d);
	d/=2;
	System.out.println(d);//no exponent ** or // floor div
}
}