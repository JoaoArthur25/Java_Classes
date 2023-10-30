public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    public double getTotalFatura() {
        double totalFatura = quantidade * preco;
        if (totalFatura < 0) {
            totalFatura = 0;
        }
        return totalFatura;
    }

    @Override
    public String toString() {
        return "Fatura numero=" + numero + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco="
                + preco;
    }

}
