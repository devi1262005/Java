import java.util.*;
public class Star {
public static void printPattern(int n)
{
int i, j;
for (i = 0; i <= n; i++) {
for (j = 0; j <= n; j++) {
System.out.print("*");
}
System.out.println();
}
 }
public static void main(String args[])
{
int n = 3;
printPattern(n);
}
}