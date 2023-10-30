public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private double notas[] = new double[5];

    public Aluno(String nome, int matricula, int idade, double notas[]) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 5;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula + "\nIdade: " + this.idade + "\nNotas: "
                + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + ", "
                + this.notas[4] + "\nMédia: " + this.calcularMedia();
    }
}
