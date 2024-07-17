import java.text.NumberFormat; /*NumberFormat is an abstract class cannot create
an instance of a NumberFormat cannot use new */ 
public class Main11{
	public static void main(String[] args){
		//NumberFormat currency = new;
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		String result=currency.format(123456.789);
		System.out.println(result);
		NumberFormat currency1=NumberFormat.getPercentInstance();
		String result1=currency1.format(0.1);
		System.out.println(result1);
		String result2=NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result2);
	}
}