package lp2_1b;

public class Exe_3 {

    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();

        Produto produto1 = new Produto( 001, " Arroz", 20.00);
        System.out.println("Produto cadastrado: " + produto1.toString());

        Produto produto2 = new Produto( 002, " Feijão", 18.00);
        System.out.println("Produto cadastrado: " + produto2.toString());
        
        Produto produto3 = new Produto( 003, " Carne", 25.00);
        System.out.println("Produto cadastrado: " + produto3.toString());

        System.out.println("---------------- Produtos Adicionados ---------------------");
        carrinho.adicionar(produto1);
        carrinho.adicionar(produto3);
        carrinho.listarProdutos();

        carrinho.remover(produto3);
        
        System.out.println("----------------- Nova lista de produtos --------------------");
        carrinho.listarProdutos();
    }

}