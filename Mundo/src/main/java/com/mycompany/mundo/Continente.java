package com.mycompany.mundo;
import java.util.ArrayList;

public class Continente
{
    private String nome;
    private ArrayList<Pais> paises;
    
    public Continente(String nome)
    {
        setNome(nome);
        paises = new ArrayList<Pais>();
    }
    
    public void adicionarPais(Pais valor)
    {
        paises.add(valor);
    }
    public void adicionarPais(String nome, double extensao, int populacao)
    {
        paises.add(new Pais(nome, extensao, populacao));
    }
    
    public double extensaoTerritorial()
    {
        double extensaototal = 0;
        for(int pais = 0; pais < this.paises.size(); pais++)
        {
            extensaototal += this.paises.get(pais).getExtensao();
        }
        return extensaototal;
    }
  
    public int populacaoTotal()
    {
        int populacaototal = 0;
        for(int pais = 0; pais < this.paises.size(); pais++)
        {
            populacaototal += this.paises.get(pais).getPopulacao();
        }
        return populacaototal;
    }
    
    public double densidadePopulacional()
    {
        return populacaoTotal()/extensaoTerritorial();
    }
    
    public Pais maiorPopulacao()
    {
        int maiorPopulacao = 0;
        int indexPais = 0;
        
        for(int pais = 0; pais < paises.size(); pais++)
        {
            if(paises.get(pais).getPopulacao() > maiorPopulacao)
            {
                maiorPopulacao = paises.get(pais).getPopulacao();
                indexPais = pais;
            }
        }
        return paises.get(indexPais);
    }
    
    public Pais menorPopulacao()
    {
        int menorPopulacao = 999999999;
        int indexPais = 0;
        
        for(int pais = 0; pais < paises.size(); pais++)
        {
            if(paises.get(pais).getPopulacao() < menorPopulacao)
            {
                menorPopulacao = paises.get(pais).getPopulacao();
                indexPais = pais;
            }
        }
        return paises.get(indexPais);
    }
    
    public Pais maiorExtensao()
    {
        double maiorExtensao = 0;
        int indexPais = 0;
        
        for(int pais = 0; pais < paises.size(); pais++)
        {
            if(paises.get(pais).getExtensao() > maiorExtensao)
            {
                maiorExtensao = paises.get(pais).getExtensao();
                indexPais = pais;
            }
        }
        return paises.get(indexPais);
    }
    
    public Pais menorExtensao()
    {
        double menorExtensao = 999999999;
        int indexPais = 0;
        
        for(int pais = 0; pais < paises.size(); pais++)
        {
            if(paises.get(pais).getExtensao()< menorExtensao)
            {
                menorExtensao = paises.get(pais).getExtensao();
                indexPais = pais;
            }
        }
        return paises.get(indexPais);
    }
    
    public double razaoTerritorial()
    {
        return maiorExtensao().getExtensao()/menorExtensao().getExtensao();
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
}
