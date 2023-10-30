public class Contato {
    private String nome;
    private int numero;
    private String email;
    
    public Contato(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return 
            " nome:" + getNome() +
            ", numero:" + getNumero() + 
            ", email:" + getEmail()
            ;
    }
}
