package basic;

import java.util.Scanner;

public class Triangle_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.printf("%d %.0f %.0f\n", i, Math.pow(i,2), Math.pow(i,3));
        }
    }
}
