public class Gotas {
    private int coluna;
    private int linha;

    public Gotas(int coluna, int linha){
        this.coluna = coluna;
        this.linha = linha;
    }

    public void moverCima(){
        linha--;
    }

    public void moverBaixo(){
        linha++;
    }

    public void moverEsquerda(){
        coluna--;
    }

    public void moverDireita(){
        coluna++;
    }
}
