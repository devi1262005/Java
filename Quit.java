import java.util.*;
public class Quit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input="";
	/* 	while(!input.equals("quit")){
			System.out.print("Input: ");
			System.out.println(input);
			input=sc.next().toLowerCase();
		} 
		do{
		System.out.print("Input: ");
			System.out.println(input);
			input=sc.next().toLowerCase();	
		}while(!input.equals("quit"));
	}*/
	while(true){
			System.out.print("Input: ");
			input=sc.next().toLowerCase();
			if(input.equals("pass"))
				continue;
			if(input.equals("quit"))
				break;
			System.out.println(input);
	
}
}
}