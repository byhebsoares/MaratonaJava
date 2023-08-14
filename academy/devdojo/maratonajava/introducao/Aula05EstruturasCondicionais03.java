package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
