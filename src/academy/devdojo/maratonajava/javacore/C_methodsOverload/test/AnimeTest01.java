package academy.devdojo.maratonajava.javacore.C_methodsOverload.test;

import academy.devdojo.maratonajava.javacore.C_methodsOverload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Action");
//        anime.init();
        anime.printData();
    }
}
