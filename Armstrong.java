import java.util.*;
public class Armstrong{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int n=num;
int res=0;
int rem=0;
for(;n>0;){
rem=n%10;
res=res+(rem*rem*rem);
n=n/10;
}
if(res==num){
System.out.println("Armstrong");
}
else{
System.out.println("Not Armstrong");
}
}
}