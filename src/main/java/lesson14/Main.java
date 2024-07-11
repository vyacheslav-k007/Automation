package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть коефіцієнт a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.solve();

        System.out.println("Рівняння " + equation + " має корені:");
        if (roots.length == 2) {
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("x = " + roots[0]);
        } else {
            System.out.println("Не має дійсних коренів.");
        }
    }
}
