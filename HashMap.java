import java.util.*;

public class HashMap{
public static void main(String[] args) {
HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("Alice", 25);
hashMap.put("Bob", 30);
hashMap.put("Charlie", 35);
System.out.println("Age of Alice: " + hashMap.get("Alice"));
System.out.println("Age of Bob: " + hashMap.get("Bob"));
hashMap.remove("Bob");
System.out.println("contents:");
for (String name : hashMap.keySet()) {
System.out.println("Name: " + name + ", Age: " + hashMap.get(name));
}
}
}

