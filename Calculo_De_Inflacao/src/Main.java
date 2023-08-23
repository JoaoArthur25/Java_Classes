import java.util.Scanner;

public class Main {
	
	public static double calculoInflacao(double valorAntigo, double valorAtual) {
		double inflacao = (valorAtual - valorAntigo) / valorAntigo;
		return inflacao;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != 2) {
			System.out.println("Digite o que deseja fazer: ");
			System.out.println("1) Calcular Inflacao.   2) Sair.");
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o valor antigo: ");
				double valorAntigo = scanner.nextDouble();
				
				System.out.println("Digite o valor atual: ");
				double valorAtual = scanner.nextDouble();
				
				System.out.println("Taxa de inflacao: " + calculoInflacao(valorAntigo, valorAtual) + "%");
			}
		}
		
		System.out.println("Obrigado por utilizar o sistema!");
		
		scanner.close();
	}
}
