class Add{
void add(int a,int b){
System.out.println(a+b);
}
void add(float a,float b){
System.out.println(a+b);
}
}
public class Poly{
public static void main(String args[]){
Add obj=new Add();
obj.add(34,56);
obj.add(23.4f,43.3f);
}
}