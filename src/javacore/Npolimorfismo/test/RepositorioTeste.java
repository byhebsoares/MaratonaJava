package src.javacore.Npolimorfismo.test;

import src.javacore.Npolimorfismo.repositorio.Repositorio;
import src.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
