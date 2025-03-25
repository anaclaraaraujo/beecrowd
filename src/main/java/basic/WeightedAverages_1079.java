package basic;

import java.util.Scanner;

public class WeightedAverages_1079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", media);

        }
    }
}
