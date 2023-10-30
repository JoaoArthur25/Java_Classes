package com.mycompany.livraria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor
{
    String nome;
    String email;
    String cpf;
    
    public void mostrarDetalhes()
    {
        System.out.println("##############################");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("cpf: " + cpf);
        System.out.println("##############################");
    }
    public Autor()
    {
        this.nome = " ";
        this.cpf = " ";
        this.email = " ";
    }
    public Autor(String nome, String email, String cpf)
    {
        this.nome = nome;
        this.email = email;
        setCpf(cpf);
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    public void setCpf(String cpf)
    {
        Pattern padraoCpf = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
        Matcher cpfPadrao = padraoCpf.matcher(cpf);
        
        Pattern padraoCpf2 = Pattern.compile("[0-9]{11}");
        Matcher cpfPadrao2 = padraoCpf2.matcher(cpf);
        if(cpfPadrao.find() || cpfPadrao2.find())
        {
            System.out.println("CPF ACEITO");
            this.cpf = cpf;
        }
        else
        {
            System.out.println("CPF NÃO ACEITO!");
        }
    }
}
