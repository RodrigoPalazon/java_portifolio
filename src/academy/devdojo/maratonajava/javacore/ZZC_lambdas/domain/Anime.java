package academy.devdojo.maratonajava.javacore.ZZC_lambdas.domain;

public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
