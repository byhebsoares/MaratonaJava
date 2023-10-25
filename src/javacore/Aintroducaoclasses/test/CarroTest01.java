package src.javacore.Aintroducaoclasses.test;

import src.javacore.Aintroducaoclasses.dominio.Carro;
//Exercicio criar 1 classe carro e criar 2 classe

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "BMW";
        carro.ano = 2022;
        carro.modelo = "Hach";

        carro1.nome = "Mercedez";
        carro1.ano = 2022;
        carro1.modelo = "Sport";

        System.out.println("Nome: " + carro.nome + " Ano: " + carro.ano + " Modelo: " + carro.modelo);
        System.out.println("Nome: " + carro1.nome + " Ano: " + carro1.ano + " Modelo: " + carro1.modelo);
    }
}
