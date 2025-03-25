package basic;

import java.util.Scanner;

public class IncomeTax_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double wage = sc.nextDouble();
        double tax = 0.0;

        if (wage <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (wage > 2000.00 && wage <= 3000.00) {
                tax += (wage - 2000.00) * 0.08;
            } else if (wage > 3000.00 && wage <= 4500.00) {
                tax += (1000.00 * 0.08);
                tax += (wage - 3000.00) * 0.18;
            } else {
                tax += (1000.00 * 0.08);
                tax += (1500.00 * 0.18);
                tax += (wage - 4500.00) * 0.28;
            }

            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }
}
