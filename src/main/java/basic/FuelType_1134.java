package basic;

import java.util.Scanner;

public class FuelType_1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        int alcohol = 0;
        int diesel= 0;
        int gasoline = 0;

        while (option != 4) {
            if (option == 1) {
                alcohol++;
            } else if (option == 2) {
                gasoline++;
            } else if (option == 3) {
                diesel++;
            }
            option = scanner.nextInt();
        }

        System.out.println("THANK YOU VERY MUCH");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
