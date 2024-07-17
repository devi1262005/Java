import java.util.*;//import java.util.Arrays;
public class Main5{
	public static void main(String[] args){
		//int[] numbers=new int[5];
		//numbers[0]=1;
		//numbers[1]=2;
		int[] numbers={2,3,5,1,4};
		System.out.println("Count:"+ numbers.length);
		//Arrays.toString(numbers);
		Arrays.sort(numbers);
		//numbers[10]=3; (exception)
		System.out.println("Address:"+numbers);//random address gets printed
		System.out.println("Array:"+Arrays.toString(numbers));//value gets printed
	}
}