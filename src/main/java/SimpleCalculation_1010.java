import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

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

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPrice);
    }
}
