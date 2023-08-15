import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a1, a2, a3, b1, b2, b3;
		
		System.out.println("Digite os valores dos lados do primeiro triangulo: ");
		a1 = scanner.nextDouble();
		a2 = scanner.nextDouble();
		a3 = scanner.nextDouble();
		
		System.out.println("Digite os valores dos lados do segundo triangulo: ");
		b1 = scanner.nextDouble();
		b2 = scanner.nextDouble();
		b3 = scanner.nextDouble();

		double p1 = (a1 + a2 + a3)/2;
		double p2 = (b1 + b2 + b3)/2;
		
		double area1 = Math.sqrt(p1*(p1-a1)*(p1-a2)*(p1-a3));
		double area2 = Math.sqrt(p2*(p2-b1)*(p2-b2)*(p2-b3));
		
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
