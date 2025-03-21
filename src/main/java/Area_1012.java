import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

public class Area_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTR = (A * C)/2;
        double areaC = 3.14159 * Math.pow(C, 2);
        double areaTP = (A + B) * C * 0.5;
        double areaSQ = Math.pow(B, 2);
        double areaR = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTR);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTP);
        System.out.printf("QUADRADO: %.3f%n", areaSQ);
        System.out.printf("RETANGULO: %.3f%n", areaR);
    }
}
