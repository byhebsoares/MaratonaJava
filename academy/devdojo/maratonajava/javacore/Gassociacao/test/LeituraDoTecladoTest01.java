package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = entrada.nextLine();
        System.out.println(nome);
        System.out.println("Digite a sua idade: ");
        int idade  = entrada.nextInt();
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("sexo: " + sexo);
    }
}
