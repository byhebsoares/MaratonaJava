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
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Juraiton", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);
        professor.imprime();

    }
}
