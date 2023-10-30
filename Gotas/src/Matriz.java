import java.util.ArrayList;
import java.util.Random;

public class Matriz{
    
    private int[][] matriz;
    private ArrayList<Gotas> gotas;
    private int coluna;
    private int linha;

    public Matriz(int coluna, int linha){
        matriz = new int[coluna][linha];
        this.coluna = coluna;
        this.linha = linha;
        gotas = new ArrayList<Gotas>();

        for(int i = 0; i < coluna; i++){
            for(int j = 0; j < linha; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void adicionarGotas( int coluna, int linha){
        this.gotas.add(new Gotas(coluna, linha));
        this.matriz[coluna][linha] = 'g';
    }

    public void imprimirMatriz(){
         for(int i = 0; i < coluna; i++){
            for(int j = 0; j < linha; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void movimentarGotas(){
        Random direcaoAleatoria = new Random();
        int direcao = direcaoAleatoria.nextInt(4);
        for(Gotas gota : gotas){
            switch(direcao){
                case 0:
                    gota.moverCima();
                    break;
                case 1:
                    gota.moverBaixo();
                    break;
                case 2:
                    gota.moverEsquerda();
                    break;
                case 3:
                    gota.moverDireita();
                    break;
            }
        }
    }
}