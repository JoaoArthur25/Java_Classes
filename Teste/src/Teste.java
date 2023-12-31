import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int minutos;
		double valor = 50.0;
		
		System.out.println("Digite o numero de minutos utilizados: ");
		minutos = scanner.nextInt();
		
		if(minutos > 100) {
			valor += (double) (minutos-100)*2;
		}
		
		System.out.println("Voce deve pagar R$ " + valor);

		scanner.close();
	}

}
