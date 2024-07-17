import java.util.*;
public class ForEach{
public static void main(String[] args){
String[] fruits={"Apple","Banana","pine"};
for(int i=0;i<fruits.length;i++){
	System.out.println(fruits[i]);
}
for(String fruit:fruits){
	System.out.println(fruit);
}
//forward only for..each cant access index
}
}