package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];

    public Produto[] getProdutos;

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    private int contador = 0;

    public void adiciona(Produto produto){
        System.out.println("Adicionando: "+ produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }
}
