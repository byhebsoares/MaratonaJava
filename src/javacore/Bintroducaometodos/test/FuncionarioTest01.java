package src.javacore.Bintroducaometodos.test;

import src.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Hebert Bezerra Soares";
        funcionario.idade = 26;
        funcionario.salario1 = 1600;
        funcionario.salario2 = 1800;
        funcionario.salario3 = 5000;

        funcionario.imprime();

    }
}
