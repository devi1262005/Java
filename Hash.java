import java.util.*;
public class Hash{
public static void main(String args[]){
HashMap<Integer,String>hm=new HashMap<>();
hm.put(101,"Manager");
hm.put(102,"Sales");
hm.put(103,"Finance");
hm.put(104,"Loan");
hm.put(105,"HR");
hm.remove(101,"Manager");
for(Map.Entry e:hm.entrySet()){
System.out.println(e.getKey()+" "+e.getValue());
System.out.println();
}
}
}