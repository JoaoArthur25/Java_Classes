public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa1 = new Pessoa("Antônio Silva");
        Pessoa pessoa2 = new Pessoa("Ricardo Silva", pessoa1, null);
        Pessoa pessoa3 = new Pessoa("Carolina Silva");
        Pessoa pessoa4 = new Pessoa("João Silva", pessoa2, pessoa3);

        System.out.println(pessoa4.isDescendent(pessoa1));
        System.out.println(pessoa4.isDescendent(pessoa3));
        
        Pessoa pessoa5 = new Pessoa("Mariu Anijar");
        Pessoa pessoa6 = new Pessoa("Natasha Anijar");
        Pessoa pessoa7 = new Pessoa("Mario Anijar", pessoa5, pessoa6);
        Pessoa pessoa8 = new Pessoa("Maysa Anijar", pessoa5, pessoa6);

        System.out.println(pessoa7.isIrmao(pessoa8));
        System.out.println(pessoa4.isIrmao(pessoa7));
        System.out.println(pessoa8.isDescendent(pessoa1));
    }
}
