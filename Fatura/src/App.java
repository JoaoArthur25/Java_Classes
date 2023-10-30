public class App {
    public static void main(String[] args) throws Exception {

        Fatura fatura1 = new Fatura("123", "Fatura 1", 10, 10.0);
        Fatura fatura2 = new Fatura("456", "Fatura 2", 5, 8.0);

        System.out.println(fatura1);
        System.out.println(fatura2);

        System.out.println("Total da fatura 1: " + fatura1.getTotalFatura());

        fatura1.setQuantidade(-10);

        System.out.println(fatura1);
        System.out.println("Total da fatura 1: " + fatura1.getTotalFatura());

        System.out.println(fatura2);
        System.out.println("Total da fatura 2: " + fatura2.getTotalFatura());

        fatura2.setPreco(-8.0);

        System.out.println(fatura2);
        System.out.println("Total da fatura 2: " + fatura2.getTotalFatura());

    }
}
