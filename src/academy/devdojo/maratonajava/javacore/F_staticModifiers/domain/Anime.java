package academy.devdojo.maratonajava.javacore.F_staticModifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

//    Order of compiling
//      0- Initialization Static Block is executed when the JVM load the class
//      1- Allocate memory space for  object
//      2- Each class attribute is created and initialized with default or set values
//      3- Initialization block is executed
//      4- Constructor is executed

//     Instance Block Initialization
    static {
        System.out.println("Within the Initialization STATIC Block - 01");
        episodes = new int [100];
        for(int i=0; i<episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Within the Initialization STATIC Block - 02");
    }

    static {
        System.out.println("Within the Initialization STATIC Block - 03");
    }

    {
        System.out.println("NOT Static Block");
    }

    public Anime() {
        for (int episode: Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
