package src.javacore.Dconstrutores.test;
import src.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuy","TV",12,"Ação","Prodution IG");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
