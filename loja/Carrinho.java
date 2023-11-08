package com.ada.loja;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> prods = new ArrayList<>();

    public boolean isVazio() {
        return prods.isEmpty();
    }

    public void adicionar(Produto prod) {
        prods.add(prod);
    }

    public boolean contem(Produto prod) {
        return prods.contains(prod);
    }

    public int getQtde() {
        return prods.size();
    }

}