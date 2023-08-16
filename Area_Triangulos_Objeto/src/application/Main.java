package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {

    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {

            Triangle triangleX = new Triangle();
            Triangle triangleY = new Triangle();

            System.out.println("Enter the measures of triangle X: ");
            readTriangleDimensions(scanner, triangleX);

            System.out.println("Enter the measures of triangle Y: ");
            readTriangleDimensions(scanner, triangleY);

            if (isValidTriangle(triangleX) && isValidTriangle(triangleY)) {
                double areaX = triangleX.area();
                double areaY = triangleY.area();

                if (areaX > areaY) {
                    System.out.println("Triangle X has a greater area.");
                } else if (areaY > areaX) {
                    System.out.println("Triangle Y has a greater area.");
                } else {
                    System.out.println("Both areas are equal.");
                }

                System.out.printf("X area: %.2f%n", areaX);
                System.out.printf("Y area: %.2f%n", areaY);
            } else {
                System.out.println("Invalid triangle dimensions.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void readTriangleDimensions(Scanner scanner, Triangle triangle) {
        try {
            triangle.a = scanner.nextDouble();
            triangle.b = scanner.nextDouble();
            triangle.c = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error reading triangle dimensions: " + e.getMessage());
        }
    }
    
    private static boolean isValidTriangle(Triangle triangle) {
        return triangle.a + triangle.b > triangle.c &&
               triangle.a + triangle.c > triangle.b &&
               triangle.b + triangle.c > triangle.a;
    }
}
