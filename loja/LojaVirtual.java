package com.ada.loja;

public class LojaVirtual {

    private Carrinho carrinho;

    public Produto criarProduto() {
        return new Produto(1, "mouse", 50D);

    }

    public Carrinho criarCarrinho() {
        carrinho = new Carrinho();
        return carrinho;
    }

    public void adicionarAoCarrinho(Produto prod) {
        this.carrinho.adicionar(prod);
    }

}
