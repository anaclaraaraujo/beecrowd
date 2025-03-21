import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

public class SimpleSum_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int SUM;

        A = sc.nextInt();
        B = sc.nextInt();

        SUM = A + B;

        System.out.println("SOMA = " + SUM);

    }
}