import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String string1 = scanner.next();
		
		System.out.println("Digite outra string: ");
		String string2 = scanner.next();
		
		System.out.println(compararFinal(string1, string2));
		
		scanner.close();
	}
	
	public static boolean compararFinal(String string1, String string2) {
		
		return string1.endsWith(string2);
	}

}
