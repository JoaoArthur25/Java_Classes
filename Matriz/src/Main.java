import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [][]matriz = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Informe o valor para a linha " + i + " e coluna " + j + ": ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("\ndiagonal principal:");
		for(int k =0; k<4 ; k++) {
			System.out.printf("%d \n", matriz[k][k]);

		}
		scanner.close();
	}

}
