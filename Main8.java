import java.util.*;
public class Main8{
public static void main(String[] args){
int x=10+3*2;//operator precedence * first then + 16
System.out.println(x);
x=(10+3)*2;//operator precedence () first then * 26
System.out.println(x);
}
}