package lp2_1b;

import java.util.ArrayList;

public class CarrinhoCompras {
    public ArrayList<Produto> lista;

    public CarrinhoCompras() {
        this.lista = new ArrayList<Produto>();
    }

    public CarrinhoCompras(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    public void adicionar(Produto p) {
        this.lista.add(p);
    }

    public void remover(Produto p) {
        this.lista.remove(p);
    }

    public void listarProdutos() {

        double total = 0.0; 

        if (lista.isEmpty()) {
            System.out.println("Não tem nada na lista");
        }else {
            for (Produto produto : lista) {
                System.out.println(produto.toString());
                total+= produto.getPreco();
            }
            System.out.println("Total: " + total);
        }

    }
}