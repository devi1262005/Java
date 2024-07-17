import java.util.*;
public class Set{
public static void main(String args[]){
TreeSet<String>hm=new TreeSet<>();
hm.add("Book");
hm.add("Note");
hm.add("Paper");
hm.add("Eraser");
hm.add("Paper");
for(String s:hm){
System.out.println(s+" ");
}
}
}

