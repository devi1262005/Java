import java.util.*;
public class Dequeue{
public static void main(String args[]){
Deque<Integer>dq=new ArrayDeque<>();
dq.add(24);
dq.add(32);
dq.add(43);
dq.add(15);
dq.addFirst(12);
dq.addLast(76);
System.out.println("Elements before deletion:");
System.out.println(dq);
System.out.println(dq.peekFirst());
System.out.println(dq.peekLast());
System.out.println(dq.pollFirst());
System.out.println(dq.pollLast());
System.out.println("Elements after deletion:");
System.out.println(dq);
}
}
