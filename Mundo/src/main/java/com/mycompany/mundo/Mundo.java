package com.mycompany.mundo;

public class Mundo {
    public static void main(String[] args) {
        Continente america = new Continente("America do Sul");
        System.out.println(america.getNome());
        
        america.adicionarPais("Brasil", 8510000, 222000000);
        america.adicionarPais("Bolivia", 1099000, 12080000);
        
        System.out.println("Extensao Territorial: " + america.extensaoTerritorial());
        System.out.println("População Total: " + america.populacaoTotal());
        System.out.println("Densidade Populacional: " + america.densidadePopulacional());
        System.out.println("Maior População: " + america.maiorPopulacao().getNome());
        System.out.println("Menor População: " + america.menorPopulacao().getNome());
        System.out.println("Maior Extensão: " + america.maiorExtensao().getNome());
        System.out.println("Menor Extensão: " + america.menorExtensao().getNome());
        System.out.println("Razão Territorial: " + america.razaoTerritorial());
    }
}
