//type casting only between compatible types (sol: use wrapper classes java.lang)
import java.util.*;
public class Main9{
public static void main(String[] args){
//implicit casting => from lower type to bigger type, here
//byte>short>int>long
//short gets converted to int
short x=4;
int y=x+1;//5 x becomes short to int
System.out.println(y);
//explicit casting
//byte>short>int>long>float>double
double a=1.1;
double b=a+2;//1.1+2.0
System.out.println(b);
b=(int)a+2;
System.out.println(b);
//wrapper classes (explicit)
String k="1";
int answer=Integer.parseInt(k)+2;
System.out.println(answer);
k="1.1";
double answer1=Double.parseDouble(k)+2;
System.out.println(answer1);
/*Float.parseFloat(k); similarly for all primitive types
int k1=1;
String.parseString(k1);
System.out.println(k1);*/
}
}