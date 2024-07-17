import java.util.*;
public class Main13{
public static void main(String[] args){
	int x=13;
	int y=12;
	System.out.println(x==y);
	System.out.println(x!=y);
	System.out.println(x>=y);
	System.out.println(x<=y);
	int temperature=21;
	boolean isWarm=temperature>20 && temperature<30;//if first cond is false sec is not eval since both have to be true for and
	System.out.println(isWarm);
	boolean hasHighIncome=true;
	boolean hasGoodCredit=true;
	boolean hasCriminalRecord=false;
	boolean E=hasHighIncome||hasGoodCredit;// if first cond true then sec is not eval since one of them be true
	boolean isEligible=(hasHighIncome||hasGoodCredit)&& !hasCriminalRecord;
	System.out.println(isEligible);

}
}