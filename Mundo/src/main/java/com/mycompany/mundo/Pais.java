package com.mycompany.mundo;

public class Pais
{
    private String nome;
    private double extensao;
    private int populacao;
    
    public Pais()
    {
        this.nome = "";
        this.extensao = 1;
        this.populacao = 1;
    }
    public Pais(String nome, double extensao, int populacao)
    {
        setNome(nome);
        setExtensao(extensao);
        setPopulacao(populacao);
    }
    
    public void setNome(String nome)
    {
        if(nome.length() > 0)
        {
            this.nome = nome;
        }
    }
    public String getNome()
    {
        return this.nome;
    }
    
    public void setExtensao(double extensao)
    {
        if(extensao > 0)
        {
            this.extensao = extensao;
        }
    }
    public double getExtensao()
    {
        return this.extensao;
    }
    
    public void setPopulacao(int populacao)
    {
        if(populacao > 0)
        {
            this.populacao = populacao;
        }
    }
    public int getPopulacao()
    {
        return this.populacao;
    }
}
