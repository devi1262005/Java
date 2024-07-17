import java.util.HashMap;
public class  MyMap{
public static void main(String[] args) {
HashMap<Integer, Student> hm= new HashMap<>();
hm.put(1, new Student("Alice", 20));
hm.put(2, new Student("Bob", 22));
hm.put(3, new Student("Charlie", 21));
hm.remove(101,"Manager");
for(HashMap.Entry e:hm.entrySet()){
System.out.println(e.getKey()+" "+e.getValue());
System.out.println();
}
}
}
class Student {
private String name;
private int age;
public Student(String name, int age) {
this.name = name;
this.age = age;
}
public String toString() {
return "Student [name=" + name + ", age=" + age + "]";
}
}
