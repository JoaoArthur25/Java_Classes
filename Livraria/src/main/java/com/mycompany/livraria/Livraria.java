package com.mycompany.livraria;

public class Livraria {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Sun tzu", "tsu_sun@yahoo.com", "00143254301");
        Livro guerra = new Livro("Arte da Guerra", "Livro filosofia e táticas de guerra", 50.5, "12-123-12345-12-1", autor1);
        guerra.mostrarDetalhes();
        guerra.aplicarDesconto(17);
        guerra.mostrarDetalhes();
        
        //Autor autor2 = new Autor();
        //Livro principe = new Livro();
        //principe.mostrarDetalhes();
    }
}
