package src.javacore.Lclassesabstratas.test;

import src.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import src.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Hebert",6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Cleitin",12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
