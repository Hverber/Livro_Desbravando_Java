package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;


public class RegistroDeVendas {
    public static void main (String[] args){

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Teste-Driven Development");
        fisico.setValor(59.90);

        if (fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é "+ fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Teste-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        Produto[] produtos = carrinho.getProdutos;

        for(int i = 0; i < produtos.length; i++){
            Produto produto = produtos[i];
            if (produto != null){
                System.out.println (produto.getValor());
            }
        }



        System.out.println("Total "+ carrinho.getTotal());


    }
}
