public class Restaurante {
    private String nome;
    private String endereco;
    private double preco;
    private String tipoComida;

    public Restaurante(String nome, String endereco, double preco, String tipoComida) {
        this.nome = nome;
        this.endereco = endereco;
        this.preco = preco;
        this.tipoComida = tipoComida;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        if (endereco.length() > 0) {
            this.endereco = endereco;
        }
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nPreço: " + this.preco + "\nTipo de comida: "
                + this.tipoComida;
    }

}
