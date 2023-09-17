package academy.devdojo.maratonajava.javacore.ZZC_lambdas.test;

import academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZC_lambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
