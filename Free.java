import java.util.*;
class Free{
int num;
String name;
Free(int num,String name){
this.num=num;
this.name=name;
}
}
public class Main{
public static void main(String args[]){
HashMap<Integer,Free>hm=new hashMap<>();
Free f1=new Free(121,"Varshan");
Free f2=new Free(122,"Vinoth");
hm.put(1,f1);
hm.put(2,f2);
for(Map.Entry<Integer,Free>e:hm.entrySet()){
int i=e.getKey();
Free f=e.getValue();
System.out.println("Detail"+i);
System.out.println(f.num+" "+f.name);
}
}
}
