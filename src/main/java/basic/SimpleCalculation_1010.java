package basic;

import java.util.Scanner;

public class SimpleCalculation_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code,number;
        double price, totalPrice;

        code = sc.nextInt();
        number = sc.nextInt();
        price = sc.nextDouble();
        totalPrice = number * price;


        code = sc.nextInt();
        number = sc.nextInt();
        price = sc.nextDouble();

        totalPrice += number * price;

        System.out.printf("AMOUNT TO PAY: R$ %.2f\n", totalPrice);
    }
}
