import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList <Contato> contatos = new ArrayList <Contato>();
       
        contatos.add(new Contato("João", 123456789, "jonarts@gmail.com"));
        contatos.add(new Contato("Mario", 987654321, "mariosnake@gmail.com"));
        contatos.add(new Contato("Kelton", 123456789, "kelthorleonin@gmail.com"));

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
