package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario anual para calcularmos a taxa de Imposto a ser paga");
        double salarioAnual = scanner.nextDouble();
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        if(salarioAnual <= 34712 ){
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual = salarioAnual * segundaFaixa;
        }else{
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
