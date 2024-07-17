import java.util.*;
public class Stack{
public static void main(string args[]){
Stack<Integer>s=newStack<Integer>();
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
Syatem.out.println(s);

System.out.println(s.peek());
}
}

