package basic;

import java.util.Scanner;

public class IntervalTwo_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (m >= 10 && m <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
