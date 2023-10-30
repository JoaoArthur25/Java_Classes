import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

        Scanner scanner = new Scanner(System.in);

        String nome, endereco, tipoComida;
        double preco;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite o nome do restaurante: ");
            nome = scanner.nextLine();

            System.out.println("Digite o endereço do restaurante: ");
            endereco = scanner.nextLine();

            System.out.println("Digite o preço do restaurante: ");
            preco = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Digite o tipo de comida do restaurante: ");
            tipoComida = scanner.nextLine();
            System.out.println();

            restaurantes.add(new Restaurante(nome, endereco, preco, tipoComida));

        }

        clrscr();

        System.out.println("Digite o tipo de comida que deseja: ");

        String tipoComidaDesejada = scanner.nextLine();

        for (Restaurante restaurante : restaurantes) {
            if (restaurante.getTipoComida().equals(tipoComidaDesejada)) {
                System.out.println(restaurante);
                System.out.println();
            }
        }

        scanner.close();
    }

    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
