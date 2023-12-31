package src.javacore.Npolimorfismo.test;

import src.javacore.Npolimorfismo.dominio.Computador;
import src.javacore.Npolimorfismo.dominio.Televisao;
import src.javacore.Npolimorfismo.dominio.Tomate;
import src.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Tomate Siciliano",10);
        Televisao TV = new Televisao("Samsumg 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(TV);
    }
}
