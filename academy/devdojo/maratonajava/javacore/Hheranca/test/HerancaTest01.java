package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("08452-140");
        Pessoa pessoa = new Pessoa("Toyota");
        pessoa.setCpf("14003654800");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Seborreio");

        funcionario.setCpf("555555");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(50000);
        System.out.println("--------------");
        funcionario.imprime();
    }
}
