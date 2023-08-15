import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String numero = scanner.nextLine();

        if (isPalindrome(numero)) {
            System.out.println("O número é um palíndromo.");
        } else {
            System.out.println("O número não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String numero) {
        String palindromo = new StringBuilder(numero).reverse().toString();
        return numero.equals(palindromo);
    }
}
