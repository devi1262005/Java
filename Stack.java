import java.util.*;
public class Stack{
public static void main(String [] args){
Stack<Integer>s=new Stack();
s.push(123);
s.push(21);
s.push(32);
s.push(11);
s.push(221);
System.out.println("Elements after pushing");
System.out.println(s);
s.pop();
s.pop();
System.out.println("Elements after popping");
System.out.println(s);

System.out.println(s.peek());
}
}
 

