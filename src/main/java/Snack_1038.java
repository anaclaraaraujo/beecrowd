import java.util.Scanner;

public class Snack_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int quantity = sc.nextInt();
        double price;

        if (item == 1) {
            price = quantity * 4;
        } else if (item == 2) {
            price = quantity * 4.5;
        } else if (item == 3) {
            price = quantity * 3.0;
        } else if (item == 4) {
            price = quantity * 1.5;
        } else if (item == 5) {
            price = quantity * 7.0;
        }  else {
            price = 0.0;
        }

        System.out.println("Total: R$ " + price);
    }
}
