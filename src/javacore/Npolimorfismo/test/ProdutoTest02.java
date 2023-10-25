package src.javacore.Npolimorfismo.test;

import src.javacore.Npolimorfismo.dominio.Computador;
import src.javacore.Npolimorfismo.dominio.Produto;
import src.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------");
        Produto produto1 = new Tomate("Tomate Cereja", 20);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}
