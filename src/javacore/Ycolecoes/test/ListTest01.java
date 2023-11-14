package src.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Hebert");
        nomes.add("Soares");

        for (String nome:nomes) {
            System.out.println(nome);
        }
    }
}
