package academy.devdojo.maratonajava.javacore.D_constructors.test;

import academy.devdojo.maratonajava.javacore.D_constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Action");
        Anime anime2 = new Anime();

        anime.printData();
        System.out.println("------------");
        anime2.printData();
    }
}
