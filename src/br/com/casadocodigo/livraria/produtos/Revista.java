package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }

    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem>0.1){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

}
