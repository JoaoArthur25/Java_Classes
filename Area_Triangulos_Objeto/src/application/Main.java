package application;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		
		double p = (x.a + x.b + x.c)/2;
		double area1 = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a + y.b + y.c)/2;
		double area2 = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		if(area1>area2) {
			System.out.println("O primeiro triangulo tem maior area.");
		}
		else if(area2>area1) {
			System.out.println("O segundo triangulo tem maior area.");
		}
		else {
			System.out.println("Os triangulos possuem a mesma area.");
		}
		
		scanner.close();
	}

}

