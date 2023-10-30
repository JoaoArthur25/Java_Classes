package com.mycompany.livraria;

public class Livro
{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    
    public void mostrarDetalhes()
    {
        System.out.println("------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("------------------------------");
    }
    
    public Livro()
    {
        this. nome = " ";
        this.descricao = " ";
        this.valor = 0;
        this.isbn = " ";
        this.autor = new Autor();
    }
    public Livro(String nome, String descricao, double valor, String isbn, Autor autor)
    {
        this. nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }
    public Livro(String nome, String descricao, double valor, String isbn, String nomeAutor, String emailAutor, String cpfAutor)
    {
        this. nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = new Autor(nomeAutor, emailAutor, cpfAutor);
    }
    
    public void aplicarDesconto(double valor)
    {
        if(valor <= 30)
        {
            this.valor -= this.valor*(valor/100);
        }
        else
        {
            System.out.println("Não pode aplicar o desconto");
        }
    }
}
