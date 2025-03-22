import java.util.Scanner;

public class FixedPassword_1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = scanner.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password");
            password = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Access allowed");
    }
}
