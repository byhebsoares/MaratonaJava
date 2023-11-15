package src.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        Collections.sort(mangas);

        List<Double> Dinheiros = new ArrayList<>();
        Dinheiros.add(100.21);
        Dinheiros.add(23.98);
        Dinheiros.add(21.21);
        Dinheiros.add(98.10);
        Collections.sort(Dinheiros);

        for(String manga: mangas){
            System.out.println(manga);
        }

        System.out.println(Dinheiros);
    }
}
