class Calc{
void calculate(){
System.out.println("Calculation");
}
}
class Add extends Calc{
void calculate(){
System.out.println("Addition");
}
}
class Sub extends Calc{
void calculate(){
System.out.println("Subtraction");
}
}
public class Poly2{
public static void main(String args[]){
Add obj1=new Add();
Calc obj2=new Calc();
Sub obj3=new Sub();
obj2.calculate();
obj1.calculate();
obj3.calculate();
}
}