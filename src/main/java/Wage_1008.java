import java.util.Scanner;

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
