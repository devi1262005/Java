import java.util.*;
public class Coll{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<>();
al.add(29);
al.add(21);
al.add(12);
al.add(30);
System.out.println(al);
Collections.sort(al);
System.out.println(al);
Collections.reverse(al);
System.out.println(al);
Collections.shuffle(al);
System.out.println(al);
Collections.sort(al);
System.out.println(Collections.binarySearch(al,12));
System.out.println();
}
}


