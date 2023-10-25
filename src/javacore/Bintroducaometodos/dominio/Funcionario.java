package src.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprime(){
        System.out.println("Nome funcionario: " + this.nome);
        System.out.println("Idade funcionario: " + this.idade + " Anos");
        System.out.println("Salário 1: " + this.salario1);
        System.out.println("Salário 2: " + this.salario2);
        System.out.println("Salário 3: " + this.salario3);
        mediaSalario();
    }
    public void mediaSalario(){
        System.out.println("media salarial: " + (salario1+salario2+salario3)/3);
    }
}
