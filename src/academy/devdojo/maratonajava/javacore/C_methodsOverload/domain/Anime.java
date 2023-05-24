package academy.devdojo.maratonajava.javacore.C_methodsOverload.domain;

public class Anime {
    private String name;
    private String typeOfAnime;
    private int episodes;
    private String gender;

    public void init(String name, String typeOfAnime, int episodes) {
        this.name = name;
        this.typeOfAnime = typeOfAnime;
        this.episodes = episodes;
    }

    public void init(String name, String typeOfAnime, int episodes, String gender) {
        this.init(name, typeOfAnime, episodes);
        this.gender = gender;
    }

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.typeOfAnime);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTypeOfAnime(String typeOfAnime) {
        this.typeOfAnime = typeOfAnime;
    }

    public String getTypeOfAnime() {
        return this.typeOfAnime;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
