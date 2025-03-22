import java.util.Scanner;

public class IntervalOne_1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 0.0 || N > 100.0) {
            System.out.println("Out of range");
        } else if (N <= 25) {
            System.out.println("[0,25]");
        } else if (N <= 50) {
            System.out.println("(25,50]");
        } else if (N <= 75) {
            System.out.println("(50,75]");
        } else {
            System.out.println("(75,100])");
        }
    }
}
