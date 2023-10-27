package src.javacore.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        //\d todos os digitos
        // \D tudo que nao for digito
        // \s todos os espacos em branco \t \n \f \r
        // \S todos caracteres excluindo os branco
        // \w a-ZA-Z, digitos, _ ander
        // []
        // ? zero ou uma ocorrencia
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        //()
        // | ou

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // String texto = "abaaba";
        String texto2 = "fulano@hotmail.com, jotaro123@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail ";
        System.out.println(" "+"#@!zoro@mail.br".matches(regex));
        System.out.println(texto2.split(",")[1].trim());
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
