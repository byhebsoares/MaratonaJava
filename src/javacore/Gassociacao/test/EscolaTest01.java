package src.javacore.Gassociacao.test;

import src.javacore.Gassociacao.dominio.Escola;
import src.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Goku");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();
    }
}
