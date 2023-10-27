package src.academy.devdojo.maratonajava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //\d todos os digitos
        // \D tudo que nao for digito
        // \s todos os espacos em branco \t \n \f \r
        // \S todos caracteres excluindo os branco
        // \w a-ZA-Z, digitos, _ ander
        // []

        String regex = "[a-zA-C]";
       // String texto = "abaaba";
        String texto2 = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("indíce: 0123456789");
        System.out.println("regex  " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
