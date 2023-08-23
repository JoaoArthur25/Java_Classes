import java.util.Scanner;

public class Main {
	
	private static double calcularFatorFrio(double temperatura, double velocidade) {
		double fatorDeFrio = 13.12 + 0.6215 * temperatura - 11.37 * Math.pow(velocidade, 0.16) + 0.3965 * temperatura * Math.pow(velocidade, 0.016);
		return fatorDeFrio;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da velocidade: ");
		double velocidade = scanner.nextDouble();
		
		double temperatura;
		
		System.out.println("Digite o valor da temperatura: ");
		temperatura = scanner.nextDouble();
		
		while (temperatura > 10) {
			System.out.println("Digite novamente o valor da temperatura,"
					+ " deve ser menor ou igual a 10: ");
			temperatura = scanner.nextDouble();
		}
		
		double fatorFrio = calcularFatorFrio(temperatura, velocidade);
		System.out.println("Fator de Frio: " + fatorFrio);
		
		scanner.close();
	}

}
