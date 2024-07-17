import java.util.*;//java.util.math
public class Main10{
public static void main(String[] args){
int result=(int)Math.round(1.1F);//rounded off
System.out.println(result);//1
result=(int)Math.ceil(1.1F);// largest to equal
System.out.println(result);//2
result=(int)Math.floor(1.1F);//equal to smallest
System.out.println(result); //1
result=Math.max(5,4);
System.out.println(result);//5
result=Math.min(5,4);
System.out.println(result);//4
int res=(int)(Math.random()*100);
System.out.println(res);
/* int result=(int) Math.random()*100 will be 0 bcs a random
number gets gen and its not casted to the whole expression
but just to Math.random() loses its frac to become 0 */
}
}