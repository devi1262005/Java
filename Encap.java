import java.util.*;
class ATM{
private int acc_no=9837403;
private double balance=3245.785;
public double setBalance(){
this.balance=balance;
return this.balance;
}
public void getBalance(){
System.out.println(this.balance);
}
}
public class Encap{
public static void main(String args[]){
ATM obj=new ATM();
obj.setBalance();
obj.getBalance();
}
}
