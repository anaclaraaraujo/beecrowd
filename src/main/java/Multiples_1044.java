import java.util.Scanner;

public class Multiples_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("They are multiple");
        } else {
            System.out.println("They are not multiple");
        }

    }
}
