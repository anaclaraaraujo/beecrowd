import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class Wage_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double hourlyWage = sc.nextDouble();
        double wage = hoursWorked * hourlyWage;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", wage);
    }
}
