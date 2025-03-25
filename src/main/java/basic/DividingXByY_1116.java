package basic;

import java.util.Scanner;

public class DividingXByY_1116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();

            if (y == 0) {
                System.out.println("impossible division");
            } else {
                System.out.println(x / y);
            }
        }
    }
}
