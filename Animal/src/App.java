public class App {
    public static void main(String[] args) throws Exception {
        Animal cachorro = new Animal("Toddy", "Cachorro");

        Cachorro cachorro2 = new Cachorro();

        cachorro2.caminha();

        Cachorro cachorro3 = new Cachorro();

        cachorro3.setNome("Leandro Sarkis");

        cachorro3.late();
    }
}
