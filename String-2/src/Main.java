import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sequencia de letras maiusculas: ");
		String sequencia = scanner.next();
		int vetor[] = new int[3];

		
		for(char i = 0; i < sequencia.length(); i++) {
			if(sequencia.charAt(i) == 'A') {
				vetor[0] += 1;
			}
			else if(sequencia.charAt(i) == 'B') {
				vetor[1] += 1;
			}
			
			else if(sequencia.charAt(i) == 'C') {
				vetor[2] += 1;
			}	
		}
		
		System.out.println("A pontuacao de Andy foi: " + vetor[0]);
		System.out.println("A pontuacao de Ben foi: " + vetor[1]);
		System.out.println("A pontuacao de Charlotte foi: " + vetor[2]);

		scanner.close();
	}
}
