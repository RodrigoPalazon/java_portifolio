package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZC_lambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference on an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
