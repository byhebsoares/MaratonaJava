package academy.devdojo.maratonajava.javacore.EblocosInicializacao.test;

import academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
