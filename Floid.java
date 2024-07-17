import java.util.*;
public class Floid{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=5;
int i,j,k=1;
for (i = 1; i <= n; i++) {
for (j = 1; j <= i; j++) {
System.out.print(k + "  ");
k++;
}
System.out.println();
}
}
}
