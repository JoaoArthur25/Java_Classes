public class Animal {
    private String nome;
    private String raca;

    public Animal() {
        this.nome = "";
        this.raca = "";
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println("O animal está caminhando...");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }
}
