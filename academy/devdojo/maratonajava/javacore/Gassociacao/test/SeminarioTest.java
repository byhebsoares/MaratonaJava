package academy.devdojo.maratonajava.javacore.Gassociacao.test;
/*
Crie um sistema que gerencie seminarios

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ter vários seminários
Um seminário deve ter um local

Campos básicos (excluindo relacionamento)
seminário: titulo
Aluno: nome e idade
professor: nome, especialidade
local: endereço
 */

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Hebert",26);
        Aluno aluno2 = new Aluno("crebsu",29);
        Aluno[] alunos = {aluno1,aluno2};

        Seminario seminario1 = new Seminario("Espaço", alunos);
        Seminario seminario2 = new Seminario("Matematica", alunos);

        Seminario[] seminarios = {seminario1,seminario2};

        Professor professor = new Professor("Juraitu","Astrologia",seminarios);
        seminario1.imprime();

    }
}
