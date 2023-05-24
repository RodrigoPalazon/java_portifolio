package academy.devdojo.maratonajava.javacore.E_initializationBlocks.test;

import academy.devdojo.maratonajava.javacore.E_initializationBlocks.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jaspion");
//        System.out.println(anime);

        for (int episode: anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
