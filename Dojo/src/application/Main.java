package application;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        MuseuArte quadro = new MuseuArte(); 
        MuseuArte escultura = new MuseuArte(); 


                System.out.println("COLOQUE O NOME DO QUADRO: ");
                String nomeQuadro = scanner.next();
                System.out.println("COLOUE O NOME DO AUTOR: ");
                String autorQuadro = scanner.next();
                System.out.println("COLOQUE A QUANTIDADE DE QUADROS: ");
                int quantidadeQuadro = scanner.nextInt();
                
                System.out.println();
                
                System.out.println("COLOQUE O NOME DA ESCULTURA: ");
                String nomeEscultura = scanner.next();
                System.out.println("COLOUE O NOME DO AUTOR: ");
                String autorEscultura = scanner.next();
                System.out.println("COLOQUE A QUANTIDADE DE ESCULTURAS: ");
                int quantidadeEscultura = scanner.nextInt();                
                
                quadro.quadro(quantidadeQuadro, nomeQuadro, autorQuadro);
                System.out.println("nome do quadro : " +quadro.mostrarQuadroName());
                System.out.println("autor do quadro: " +quadro.mostrarAutorQuadro());
                System.out.println("preco do quadro: "+ quadro.mostrarPrecoQuadro());
              
                
              
                escultura.Escultura(quantidadeEscultura, nomeEscultura, autorEscultura);
                System.out.println("nome da escultura : " +quadro.mostrarEsculturaName());
                System.out.println("autor da escultura: " +quadro.mostrarAutorEscultura());
                System.out.println("preco da escultura: "+ quadro.mostrarPrecoEscultura());
                
            
                
                System.out.println("INSIRA OUTRO NOME PARA O QUADRO: ");
                quadro.nomeQuadro = scanner.next();
                System.out.println("INSIRA OUTRA QUANTIDADE PARA O QUADRO: ");
                quadro.quantidadeQuadro = scanner.nextInt();
                System.out.println("INSIRA OUTRO AUTOR PARA O QUADRO: ");
                quadro.autorQuadro = scanner.next();
                System.out.println();
                System.out.println("INSIRA OUTRO NOME PARA A ESCULTURA: ");
                escultura.nomeEscultura = scanner.next();
                System.out.println("INSIRA OUTRA QUANTIDADE PARA A ESCULTURA: ");
                escultura.quantidadeEscultura = scanner.nextInt();
                System.out.println("INSIRA OUTRO AUTOR PARA A ESCULTURA: ");
                escultura.autorEscultura = scanner.next();
               
                System.out.println("nome do quadro : " +quadro.mostrarQuadroName());
                System.out.println("autor do quadro: " +quadro.mostrarAutorQuadro());
                System.out.println("preco do quadro: "+ quadro.mostrarPrecoQuadro());
              
                System.out.println("nome da escultura : " +quadro.mostrarEsculturaName());
                System.out.println("autor da escultura: " +quadro.mostrarAutorEscultura());
                System.out.println("preco da escultura: "+ quadro.mostrarPrecoEscultura());
                
        scanner.close();
    }
}