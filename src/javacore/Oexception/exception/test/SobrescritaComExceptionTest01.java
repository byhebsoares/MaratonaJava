package src.javacore.Oexception.exception.test;

import src.javacore.Oexception.exception.dominio.LoginInvalidoException;
import src.javacore.Oexception.exception.dominio.Pessoa;
import src.javacore.Oexception.exception.dominio.Funcionario;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
