package com.mycompany.projetao;

public class Jogo
{
    private String nome;
    private String genero;
    
    public Jogo()
    {
        System.out.println("Instanciando o objeto ...");
    }
    public Jogo(String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }
}
