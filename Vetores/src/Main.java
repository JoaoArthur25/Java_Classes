import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vetor[] = new int[15];
		
		System.out.println("Digite 15 numeros inteiros: ");
		
		for (int i = 0; i<15; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = scanner.nextInt();
			
			if(vetor[i] % 2 == 0) {
				System.out.println("este numero e par");
			} else {
				System.out.println("este numero e impar");
			}
		}
		
		scanner.close();	
	}
}
