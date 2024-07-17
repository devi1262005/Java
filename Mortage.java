import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class Mortage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P, N;
        float R;

        while (true) {
            System.out.println("Enter P (principal amount):");
            P = sc.nextInt();
            if (P >= 1_000 && P <= 1_000_000_000) {
                break;
            } else {
                System.out.println("Enter a principal amount between 1000 and 1 million.");
            }
        }

        while (true) {
            System.out.println("Enter R (annual interest rate):");
            R = sc.nextFloat();
            if (R > 0 && R < 100) {
                R = R / 100 / 12; // Monthly interest rate
                break;
            } else {
                System.out.println("Enter a proper annual interest rate.");
            }
        }

        while (true) {
            System.out.println("Enter N (loan term in years):");
            N = sc.nextInt();
            if (N >= 1 && N <= 30) {
                N = N * 12; // Convert years to months
                break;
            } else {
                System.out.println("Enter a proper loan term between 1 and 30 years.");
            }
        }

        double M = P * (R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
        System.out.println("Your mortgage monthly payment:");
        System.out.println(NumberFormat.getCurrencyInstance().format(M));
    }
}
