package basic;

import java.util.Scanner;

public class Quadrant_1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("FIRST");
            } else if (x < 0 && y > 0) {
                System.out.println("SECOND");
            } else if (x < 0 && y < 0) {
                System.out.println("THIRD");
            } else {
                System.out.println("FOURTH");
            }

            x = sc.nextDouble();
            y = sc.nextDouble();
        }

        sc.close();
    }
}
