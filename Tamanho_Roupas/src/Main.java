import java.util.Scanner;

public class Main {

    public static double calcularTamanhoChapeu(double altura, double peso) {
        double chapeu = (peso / altura) * 2.9;
        return chapeu;
    }

    public static double calcularTamanhoCasaco(double altura, double peso, int idade) {
        double casaco = ((altura * peso) / 288) + (idade > 30 ? ((idade - 30) / 10.0) * 0.125 : 0);
        return casaco;
    }

    public static double calcularCintura(double peso, int idade) {
        double cintura = (peso / 5.7) + (idade > 28 ? ((idade - 28) / 2.0) * 0.1 : 0);
        return cintura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1) Calcular tamanhos.   2) Sair.");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Digite o seu peso: ");
                double peso = scanner.nextDouble();

                System.out.println("Digite a sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Tamanhos: ");
                System.out.println("Chapeu: " + calcularTamanhoChapeu(altura, peso) + " polegadas");
                System.out.println("Casaco: " + calcularTamanhoCasaco(altura, peso, idade) + " polegadas");
                System.out.println("Cintura: " + calcularCintura(peso, idade) + " polegadas");
            }
        }

        System.out.println("Obrigado por utilizar o sistema!");

        scanner.close();
    }
}
