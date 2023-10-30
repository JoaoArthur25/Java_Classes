import java.util.Objects;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.mae = null;
        this.pai = null;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pessoa pessoa = (Pessoa) obj;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae);
    }

    public boolean isIrmao(Pessoa pessoa) {
        if ((this.pai != null && this.pai.equals(pessoa.pai)) || (this.mae != null && this.mae.equals(pessoa.mae))) {
            return true;
        }
        return false;
    }

    public boolean isDescendent(Pessoa pessoa) {
        if (pessoa == null || this.equals(pessoa)) {
            return false;
        }

        return (this.pai != null && this.pai.isDescendent(pessoa))
                || (this.mae != null && this.mae.isDescendent(pessoa)) || this.pai == pessoa || this.mae == pessoa;
    }

    @Override
    public String toString() {
        String paiNome = (pai != null) ? pai.getNome() : "Desconhecido";
        String maeNome = (mae != null) ? mae.getNome() : "Desconhecida";
        return "Nome: " + nome + "\nPai: " + paiNome + "\nMãe: " + maeNome;
    }

}