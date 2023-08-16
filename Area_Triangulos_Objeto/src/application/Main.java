package application;

import java.util.Scanner;
import entities.Triangle;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangle triangleX, triangleY;

        triangleX = new Triangle();
        triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.a = scanner.nextDouble();
        triangleX.b = scanner.nextDouble();
        triangleX.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.a = scanner.nextDouble();
        triangleY.b = scanner.nextDouble();
        triangleY.c = scanner.nextDouble();

        double pX = (triangleX.a + triangleX.b + triangleX.c) / 2;
        double areaX = Math.sqrt(pX * (pX - triangleX.a) * (pX - triangleX.b) * (pX - triangleX.c));

        double pY = (triangleY.a + triangleY.b + triangleY.c) / 2;
        double areaY = Math.sqrt(pY * (pY - triangleY.a) * (pY - triangleY.b) * (pY - triangleY.c));

        if (areaX > areaY) {
            System.out.println("Triangle X has a greater area.");
        } else if (areaY > areaX) {
            System.out.println("Triangle Y has a greater area.");
        } else {
            System.out.println("Both areas are equal.");
        }

        System.out.printf("X area: %.2f%n", areaX);
        System.out.printf("Y area: %.2f%n", areaY);

        scanner.close();
    }
}
